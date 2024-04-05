package com.github.gabrielrechbrand.emprestimodvd.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Amigo extends Pessoa {
    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String telefone;

    @Column
    private String email;

    @Column
    private String endereco;

    @OneToOne
    @JoinColumn(name = "pessoa_id", referencedColumnName = "id")
    private Pessoa pessoa;
}
