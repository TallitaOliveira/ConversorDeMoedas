import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class Conversor {
    private final String API_KEY =  "5e075630549bf9870e2f76c";

    public double converter(String from, String to, double amount) {
        try {
            String url = String.format("https://v6.exchangerate-api.com/v6/%s/latest/%s", "5e0756930549bf9870e2f76c", from);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            RespostaExchangeRate resposta = gson.fromJson(response.body(), RespostaExchangeRate.class);

            double taxa = resposta.conversion_rates.get(to);
            return amount * taxa;

        } catch (Exception e) {
            System.out.println("Erro ao converter: " + e.getMessage());
            return 0;
        }
    }
}

