package com.github.gabrielrechbrand.emprestimodvd.repository;

import com.github.gabrielrechbrand.emprestimodvd.model.DVD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DVDRepository extends JpaRepository<DVD, UUID> {
}
