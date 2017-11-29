package x20171108;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Szabó Imre Márió
 */

class Diak implements Serializable {
  String nev;
  Integer kor;
}

public class Sorositas {
    
  private static final String FILE = "diakok.xml";
    
  public static void make() throws FileNotFoundException, IOException {
    Diak d1 = new Diak();
    d1.nev = "Nagy Sándor";
    d1.kor = 33;
    
    Diak d2 = new Diak();
    d2.nev = "Eszme Ralda";
    d2.kor = 28;
    
    FileOutputStream fos = new FileOutputStream("data.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(d1);
    oos.writeObject(d2);
    oos.close();
    fos.close();
  }
  public static void load() throws FileNotFoundException, IOException, ClassNotFoundException {
    Diak egy = new Diak();
    Diak ketto = new Diak();
    
    FileInputStream fis = new FileInputStream("data.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    
    egy = (Diak)ois.readObject();
    ketto = (Diak)ois.readObject();
    
    ois.close();
    fis.close();
    
    System.out.println("Diák1: "+egy.nev+"\nKor: "+egy.kor+"\n");
    System.out.println("Diák2: "+ketto.nev+"\nKor: "+ketto.kor+"\n");
    
  }
  
  public static void load2() throws FileNotFoundException, IOException, ClassNotFoundException {
    Diak egy = new Diak();
    
    FileInputStream fis = new FileInputStream("data.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    
    try {
      int i = 1;
      while(true){
      egy = (Diak)ois.readObject();
      System.out.println("Diák"+i+": "+egy.nev+"\nKor: "+egy.kor+"\n");
      i++;
    }
    }catch(Exception e){
      ois.close();
      fis.close();
    }
  }
  
  public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
    make();
    load();
    load2();
  }
}
