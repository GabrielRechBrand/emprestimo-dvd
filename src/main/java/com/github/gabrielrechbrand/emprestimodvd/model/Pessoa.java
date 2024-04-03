package com.github.gabrielrechbrand.emprestimodvd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Pessoa {
    @Id
    @GeneratedValue
    private UUID id;

    private String nome;
}
