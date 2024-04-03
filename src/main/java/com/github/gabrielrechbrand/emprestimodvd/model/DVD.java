package com.github.gabrielrechbrand.emprestimodvd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class DVD {

    @Id
    private UUID id;

    @Column
    private String titulo;

    @Column
    private String sinopse;

}
