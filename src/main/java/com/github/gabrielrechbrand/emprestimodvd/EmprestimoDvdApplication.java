package com.github.gabrielrechbrand.emprestimodvd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmprestimoDvdApplication {
    private static boolean executado = false;

    public static void main(String[] args) {
        SpringApplication.run(EmprestimoDvdApplication.class, args);

        cadastraAmigos();
        cadastraDVDs();
        registraEmprestimos();
    }

    public static void cadastraAmigos() {

    }

    public static void cadastraDVDs() {

    }

    public static void registraEmprestimos() {

    }
}
