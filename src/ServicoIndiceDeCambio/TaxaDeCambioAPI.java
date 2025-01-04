package ServicoIndiceDeCambio;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class TaxaDeCambioAPI {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/75438e6dff9798722ebcd3f1/latest/";

    public double getIndiceDeTroca(String origem, String para) throws Exception {
        // Construir a URL da API
        String requestUrl = API_URL + origem;
        URL url = new URL(requestUrl);

        // Abrir conexão HTTP
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Checar se a resposta é bem-sucedida
        if (connection.getResponseCode() != 200) {
            throw new RuntimeException("Erro ao buscar taxas de câmbio: " + connection.getResponseCode());
        }

        // Ler e parsear o JSON retornado
        InputStreamReader reader = new InputStreamReader(connection.getInputStream());
        JsonObject jsonResponse = JsonParser.parseReader(reader).getAsJsonObject();

        // Buscar a taxa de câmbio
        JsonObject rates = jsonResponse.getAsJsonObject("conversion_rates");
        if (!rates.has(para)) {
            throw new IllegalArgumentException("Moeda não suportada: " + para);
        }

        return rates.get(para).getAsDouble();
    }
}

