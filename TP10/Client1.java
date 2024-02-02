import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Client1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java Client1 <movie_title>");
            System.exit(1);
        }

        try {
            CloseableHttpClient client = HttpClients.createDefault();
            String apiKey = "751ea6aa";
            String movieTitle = args[0];
            String url = "http://www.omdbapi.com/?apikey=" + apiKey + "&t=" + movieTitle;
            HttpGet request = new HttpGet(url);
            System.out.println("Executing request: " + request.getRequestLine());
            CloseableHttpResponse response = client.execute(request);
            System.out.println("Response Line: " + response.getStatusLine());
            System.out.println("Response Code: " + response.getStatusLine().getStatusCode());
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuffer result = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
                result.append("\n");
            }
            String jsonResponse = result.toString();
            System.out.println(jsonResponse);
            client.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
