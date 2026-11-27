package br.com.alura.screenmatch.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class ConsultaGemini {

    public static String obterTraducao(String texto) {
        Client client = new Client();

        GenerateContentResponse resposta = client.models.generateContent(
                "gemini-3.5-flash-lite",
                "Traduza o texto para português do Brasil. "
                        + "Retorne somente a tradução, sem opções, explicações ou comentários: "
                        + texto,
                null
        );

        return resposta.text() != null ? resposta.text() : "";
    }
}


