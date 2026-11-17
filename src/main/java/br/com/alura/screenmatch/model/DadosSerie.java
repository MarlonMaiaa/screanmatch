package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer totalTemporadas,
        @JsonAlias("imdbRating") String avaliacao,
        @JsonAlias ("Actors") String atores,
        @JsonAlias("Genre")String genero,
        @JsonAlias("Poster")String Poster,
        @JsonAlias("Plot")String Sinopse
)

{

    @Override
    public String toString() {
        return "\n*****Dados Serie*****" +
                "\nTitulo:" + titulo +
                "\nTotalTemporadas: " + totalTemporadas +
                "\nAvaliacao: " + avaliacao +
                "\nAtores: " + atores +
                "\nGenero: " + genero +
                "\nPoster: " + Poster +
                "\n"+
                "\nSinopse: " + Sinopse +
                "\n";

    }
}
