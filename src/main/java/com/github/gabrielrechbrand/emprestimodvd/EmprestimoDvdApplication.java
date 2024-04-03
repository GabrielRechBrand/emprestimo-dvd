package com.github.gabrielrechbrand.emprestimodvd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmprestimoDvdApplication {
    private static boolean executado = false;

    public static void main(String[] args) {
        SpringApplication.run(EmprestimoDvdApplication.class, args);
    }

    public EmprestimoDvdApplication() {
        execute();
    }

    public static void execute() {
        if (executado) return;

        new Thread(() -> {
            try {
                Thread.sleep(5_000);

                cadastraAmigos();
                cadastraDVDs();
                registraEmprestimos();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).run();
    }

    public static void cadastraAmigos() {

    }

    public static void cadastraDVDs() {

    }

    public static void registraEmprestimos() {

    }
}
