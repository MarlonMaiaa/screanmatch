package br.com.alura.screenmatch.service;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.ChatModel;
import com.openai.models.responses.ResponseCreateParams;

public class ConsultaChatGPT {

    public static String obterTraducao(String texto) {

        OpenAIClient client = OpenAIOkHttpClient.fromEnv();

        ResponseCreateParams parametros = ResponseCreateParams.builder()
                .model(ChatModel.GPT_5_2)
                .input("Traduza para o português o texto: " + texto)
                .build();

        var resposta = client.responses().create(parametros);

        return resposta.output().stream()
                .flatMap(item -> item.message().stream())
                .flatMap(message -> message.content().stream())
                .flatMap(content -> content.outputText().stream())
                .map(outputText -> outputText.text())
                .findFirst()
                .orElse("");


    }
}
