package com.github.gabrielrechbrand.emprestimodvd.controller;

import com.github.gabrielrechbrand.emprestimodvd.model.Pessoa;
import com.github.gabrielrechbrand.emprestimodvd.service.GenericService;
import com.github.gabrielrechbrand.emprestimodvd.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController extends GenericController<Pessoa, UUID> {

    @Autowired
    private PessoaService pessoaService;

    @Override
    protected GenericService<Pessoa, UUID> getService() {
        return pessoaService;
    }

}
