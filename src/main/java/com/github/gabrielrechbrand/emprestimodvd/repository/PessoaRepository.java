package com.github.gabrielrechbrand.emprestimodvd.repository;

import com.github.gabrielrechbrand.emprestimodvd.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, UUID> {
}
