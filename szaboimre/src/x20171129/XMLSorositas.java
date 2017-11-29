package x20171129;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

/**
 * @author Szabó Imre Márió
 */

class Diakok implements Serializable {

    String nev;
    Integer kor;
}

public class XMLSorositas {

    private static final String FILE = "diakok.xml";

    public static void make() throws FileNotFoundException {
        Diakok d1 = new Diakok();
        d1.nev = "Nagy Sándor";
        d1.kor = 33;

        Diakok d2 = new Diakok();
        d2.nev = "Eszme Ralda";
        d2.kor = 28;

        XMLEncoder kiir = null;
        try {
            kiir = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(FILE)));
        } catch (FileNotFoundException fnfe) {
            System.out.println("ERROR: A diakok.xml fájl készítése közben hiba lépett fel.");
        }
        kiir.writeObject(d1);
        kiir.close();
    }

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        make();
    }
}
