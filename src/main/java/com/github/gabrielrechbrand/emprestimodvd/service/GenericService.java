package com.github.gabrielrechbrand.emprestimodvd.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public abstract class GenericService<T, ID extends Serializable> {

    protected abstract JpaRepository<T, ID> getRepository();

    public T save(T entity) {
        return getRepository().save(entity);
    }

    public Optional<T> findById(ID id) {
        return getRepository().findById(id);
    }

    public List<T> findAll() {
        return getRepository().findAll();
    }

    public void deleteById(ID id) {
        getRepository().deleteById(id);
    }

    public T update(ID id, T entity) {
        if(getRepository().existsById(id)) {
            return getRepository().save(entity);
        }
        return null;
    }
}