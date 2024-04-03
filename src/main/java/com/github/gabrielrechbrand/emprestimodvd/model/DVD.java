package com.github.gabrielrechbrand.emprestimodvd.model;

import com.github.gabrielrechbrand.emprestimodvd.enumeration.EnumGenero;
import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class DVD {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String titulo;

    @Column
    private String sinopse;

    @Column
    private EnumGenero genero;

    @ManyToOne
    private Pessoa diretor;

    @ManyToOne
    private Pessoa artistaPrincipal;

}
