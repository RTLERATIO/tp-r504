import java.io.*;
import java.net.*;

public class ClientTCP3 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Veuillez fournir une chaîne de caractères en argument.");
            return;
        }
        try {
            Socket socket = new Socket("localhost", 2016);
            DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
            dOut.writeUTF(args[0]);

            DataInputStream dIn = new DataInputStream(socket.getInputStream());
            String reversedMessage = dIn.readUTF();
            System.out.println("Message inversé reçu du serveur : " + reversedMessage);

            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
