package com.github.gabrielrechbrand.emprestimodvd.service;

import com.github.gabrielrechbrand.emprestimodvd.model.Pessoa;
import com.github.gabrielrechbrand.emprestimodvd.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PessoaService extends GenericService<Pessoa, UUID> {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    protected JpaRepository<Pessoa, UUID> getRepository() {
        return pessoaRepository;
    }
}