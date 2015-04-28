package gr.peustr.tcpclient;

import java.io.DataOutputStream;
import static java.lang.Thread.sleep;
import java.net.Socket;
import java.util.Random;

/**
 *
 * @author peustr
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Random gen = new Random();
        try (Socket clientSocket = new Socket("localhost", 5051)) {
            while (true) {
                DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
                out.writeBytes(String.valueOf(gen.nextInt(100)) + "\n");
                sleep(1000);
            }
        }
    }

}
