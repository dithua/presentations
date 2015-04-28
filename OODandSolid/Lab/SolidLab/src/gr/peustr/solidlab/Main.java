package gr.peustr.solidlab;

import gr.peustr.solidlab.io.DataReader;
import gr.peustr.solidlab.io.NetworkDataReader;

/**
 *
 * @author peustr
 */
public class Main {

    public static void main(String[] args) {
//        DataReader dr = new FileDataReader("res/info.txt");
        DataReader dr = new NetworkDataReader(5051);
        String buffer;
        while ((buffer = dr.read()) != null) {
            System.out.println(buffer);
        }
    }

}
