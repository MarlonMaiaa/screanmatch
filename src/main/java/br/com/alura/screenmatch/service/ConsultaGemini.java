package br.com.alura.screenmatch.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class ConsultaGemini {

    public static String obterTraducao(String texto) {
        Client client = new Client();

        GenerateContentResponse resposta = client.models.generateContent(
                "gemini-3.5-flash-lite",
                "Traduza para o português o texto: " + texto,
                null
        );

        return resposta.text() != null ? resposta.text() : "";
    }
}


