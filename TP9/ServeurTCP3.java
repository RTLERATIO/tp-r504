import java.io.*;
import java.net.*;

public class ServeurTCP3 {
    public static void main(String[] args) {
        while (true) {
            try {
                ServerSocket socketserver = new ServerSocket(2016);
                System.out.println("Serveur en attente");
                Socket socket = socketserver.accept();
                System.out.println("Connexion d'un client");

                DataInputStream dIn = new DataInputStream(socket.getInputStream());
                String message = dIn.readUTF();
                System.out.println("Message reçu du client : " + message);

                String reversedMessage = new StringBuilder(message).reverse().toString();

                DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
                dOut.writeUTF(reversedMessage);

                socket.close();
                socketserver.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
