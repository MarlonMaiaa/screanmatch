package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action"),
    AVENTURA("Adventure"),
    ANIMACAO("Animation"),
    BIOGRAFIA("Biography"),
    COMEDIA("Comedy"),
    CRIME("Crime"),
    DOCUMENTARIO("Documentary"),
    DRAMA("Drama"),
    FAMILIA("Family"),
    FANTASIA("Fantasy"),
    FILM_NOIR("Film-Noir"),
    GAME_SHOW("Game-Show"),
    HISTORIA("History"),
    TERROR("Horror"),
    MUSICA("Music"),
    MUSICAL("Musical"),
    MISTERIO("Mystery"),
    NOTICIAS("News"),
    REALITY_TV("Reality-TV"),
    ROMANCE("Romance"),
    FICCAO_CIENTIFICA("Sci-Fi"),
    CURTA_METRAGEM("Short"),
    ESPORTE("Sport"),
    TALK_SHOW("Talk-Show"),
    SUSPENSE("Thriller"),
    GUERRA("War"),
    FAROESTE("Western");


    private String CategoriaOmdb;

    Categoria(String CategoriaOmdb) {
        this.CategoriaOmdb = CategoriaOmdb;

    }
    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.CategoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }



}
