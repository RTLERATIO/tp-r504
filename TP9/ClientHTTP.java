import java.io.*;
import java.net.*;

public class ClientHTTP {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Veuillez spécifier l'URL en argument.");
            return;
        }

        String host = args[0];
        try {
            Socket socket = new Socket(host, 80);

            OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
            InputStreamReader isw = new InputStreamReader(socket.getInputStream());

            BufferedWriter bufOut = new BufferedWriter(osw);
            BufferedReader bufIn = new BufferedReader(isw);

            String request = "GET / HTTP/1.0\r\n\r\n";
            bufOut.write(request);
            bufOut.flush();

            String line = bufIn.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufIn.readLine();
            }

            bufIn.close();
            bufOut.close();
            socket.close();
        } catch (UnknownHostException e) {
            System.err.println("Hôte inconnu : " + host);
        } catch (IOException e) {
            System.err.println("Erreur lors de la communication avec le serveur : " + e.getMessage());
        }
    }
}
