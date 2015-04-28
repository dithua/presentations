package gr.peustr.solidlab.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author peustr
 */
public class NetworkDataReader extends SimpleDataReader {

    private ServerSocket socket;
    private Socket connectionSocket;
    private BufferedReader in;

    public NetworkDataReader(int port) {
        try {
            socket = new ServerSocket(port);
            connectionSocket = socket.accept();
            in = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }

    @Override
    public String read() {
        try {
            return in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        return null;
    }

}
