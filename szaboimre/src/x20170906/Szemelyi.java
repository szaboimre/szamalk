
package x20170906;

import java.util.Scanner;


public class Szemelyi {

    
    public static void main(String[] args) {
        System.out.println("Szia, ez egy szem szam ellenörző program!");
        Scanner sc = new Scanner(System.in);
        String szemsz;
        do {
            szemsz = sc.nextLine();
        } while (szemsz.length() != 11);
        
        
        
        String evszam1 = Character.toString(szemsz.charAt(1));
        String evszam2 = Character.toString(szemsz.charAt(2));
        String evszamossz = evszam1 + evszam2;
        int evszam = Integer.parseInt(evszamossz);
        
        if (evszam > 96 || evszam < 17) {
            System.out.println("Ez egy 1996 utáni szem. szám");
            hatfelett(szemsz);
        }
        else if (evszam <= 96) {
            System.out.println("Ez egy 1997 elötti szem. szám");
            hetalatt(szemsz);
        }
        
        nemek(szemsz);
    }

    private static void hatfelett(String szemsz) {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += (10-i) * Integer.parseInt(Character.toString(szemsz.charAt(i)));
        }
        int modulo = osszeg%11;
        
        if (Integer.parseInt(Character.toString(szemsz.charAt(10))) != modulo) {
            System.out.println("Nem jó szem. szám!");
        }
        else System.out.println("Jó szem. szám!");
    }

    private static void hetalatt(String szemsz) {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += (i+1) * Integer.parseInt(Character.toString(szemsz.charAt(i))); 
        }
        int modulo = osszeg%11;
        
        if (Integer.parseInt(Character.toString(szemsz.charAt(10))) != modulo) {
            System.out.println("Nem jó szem. szám!");
        }
        else System.out.println("Jó szem. szám!");
    }
    
    private static void nemek (String szemsz) {
        int elsoSzam = Integer.parseInt(Character.toString(szemsz.charAt(0))); 
        
        if (elsoSzam % 2 == 0) {
            System.out.println("Nőé a szem. szám!");
        }
        else System.out.println("Férfié a szem. szám!");
    }
    
}
