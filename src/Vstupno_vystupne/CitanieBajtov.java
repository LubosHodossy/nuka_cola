package Vstupno_vystupne;
import java.io.*;

public class CitanieBajtov {
    public static void main(String[] args) throws IOException {
        byte data[] = new byte[10];

        System.out.println("Zadajte nejaké znaky.");
        System.in.read(data);
        System.out.println("Zadali ste: ");

        for (int i=0; i<data.length; i++) System.out.println((char) data[i]);
    }
}
