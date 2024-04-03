package com.github.gabrielrechbrand.emprestimodvd.enumeration;

public enum EnumGenero {
    ACAO("Ação", "Filmes com muita ação, aventura e adrenalina."),
    COMEDIA("Comédia", "Filmes para rir e se divertir."),
    DRAMA("Drama", "Histórias emocionantes e profundas."),
    TERROR("Terror", "Filmes para provocar medo e suspense."),
    FICCAO_CIENTIFICA("Ficção Científica", "Exploração de futuros, tecnologias e universos."),
    ROMANCE("Romance", "Histórias de amor e relacionamentos."),
    FANTASIA("Fantasia", "Mundos imaginários e criaturas mágicas."),
    DOCUMENTARIO("Documentário", "Filmes baseados em fatos reais e histórias verídicas."),
    ANIMACAO("Animação", "Filmes feitos com técnicas de animação, para todas as idades."),
    MUSICAL("Musical", "Filmes que contêm performances musicais como parte fundamental da trama."),
    AVENTURA("Aventura", "Filmes com histórias de exploração e descoberta."),
    SUSPENSE("Suspense", "Filmes que mantêm os espectadores na expectativa, com muitos mistérios."),
    HISTORICO("Histórico", "Filmes baseados ou inspirados em eventos históricos."),
    GUERRA("Guerra", "Filmes que retratam conflitos armados, sejam históricos ou fictícios."),
    POLICIAL("Policial", "Filmes focados em histórias de crime e investigação."),
    FICCAO("Ficção", "Filmes que exploram histórias fictícias com elementos imaginativos."),
    BIOGRAFICO("Biográfico", "Filmes que contam a história de vida de pessoas reais.");

    private final String nome;
    private final String descricao;

    EnumGenero(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return nome + ": " + descricao;
    }
}
