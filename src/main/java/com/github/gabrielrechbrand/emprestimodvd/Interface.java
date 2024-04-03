package com.github.gabrielrechbrand.emprestimodvd;

import com.github.gabrielrechbrand.emprestimodvd.model.DVD;

public interface Interface extends RelatorioEmprestimos {
    void imprime(String texto);
    void imprimeMenu();

    DVD leDVD();
    // Amigo leAmigo();
    // Emprestimo leEmprestimo();
    // boolean alertaFaixaEtaria(Amigo amigo, DVD dvd);
}
