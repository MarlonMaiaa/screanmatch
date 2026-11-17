package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias("Title") String titulo,
                            @JsonAlias("Episode") Integer numero,
                            @JsonAlias("imdbRating") String avaliacao,
                            @JsonAlias("Released") String dataLancamento,
                            @JsonAlias ("Actors") String atores,
                            @JsonAlias ("Director") String diretor){

    @Override
    public String toString() {
        return """
        Episódio: %d
        Título: %s
        Avaliação: %s
        Data de lançamento: %s
        Atores: %s
        Diretor: %s
        ------------------------------
        """.formatted(numero, titulo, avaliacao, dataLancamento, atores, diretor);
    }
}