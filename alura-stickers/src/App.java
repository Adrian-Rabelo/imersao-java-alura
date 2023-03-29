import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        // Fazer uma conexão HTTP e buscar os top 250 filmes
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        // Capturar só os dados que interessam (título, pôster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        // Exibir e manipular os dados
        for (Map<String,String> filme : listaDeFilmes) {
            System.out.println("\u001b[1m" + "Título: " + "\u001b[m" + filme.get("title"));
            System.out.println("\u001b[1m" + "Pôster: " + "\u001b[m" + filme.get("image"));
            Double nota = Double.parseDouble(filme.get("imDbRating"));
            if (nota >= 8) {
                System.out.println("\u001b[47m \u001b[102m" + " Avaliação: " + filme.get("imDbRating") + " \u001b[m");
            } else if (nota >= 6 && nota < 8) {
                System.out.println("\u001b[47m \u001b[103m" + " Avaliação: " + filme.get("imDbRating") + " \u001b[m");
            } else {
                System.out.println("\u001b[47m \u001b[101m" + " Avaliação: " + filme.get("imDbRating") + " \u001b[m");
            }
            for (int i = 0; i < Math.round(nota); i++) {
                System.out.print("\u2B50");
            }
            System.out.println();
            System.out.println();
            
        }
    }
}
