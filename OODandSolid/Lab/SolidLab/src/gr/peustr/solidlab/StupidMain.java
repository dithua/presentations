package gr.peustr.solidlab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author peustr
 */
public class StupidMain {

    public static void main(String[] args) {
        File f = new File("res/info.txt");
        try {
            BufferedReader in = new BufferedReader(new FileReader(f));
            String buffer;
            while ((buffer = in.readLine()) != null) {
                System.out.println(buffer);
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }

}
