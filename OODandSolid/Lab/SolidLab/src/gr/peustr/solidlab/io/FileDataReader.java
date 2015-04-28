package gr.peustr.solidlab.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author peustr
 */
public class FileDataReader extends SimpleDataReader {

    private File f;
    private BufferedReader in;

    public FileDataReader(String filename) {
        f = new File(filename);
        try {
            in = new BufferedReader(new FileReader(f));
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
