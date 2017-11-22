/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171115;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

/**
 *
 * @author Tanulo
 */
public class ZH {
    public static String [] versenyzok = new String[500];
    public static String [] valaszok = new String[500];
    public static int szamlalo;
    public static String joValasz = "";
    public static String valasz = "";
    public static int [] pontok = new int[500];
    
    public static void main(String[] args) {
        elso();
        masodik();
        harmadik();
        negyedik();
        otodik();
        hatodik();
        hetedik();
    }
    
    public static void elso(){
        szamlalo = -1;
        String versenyzoSeged = "";
        String valaszokSeged = "";
        String szoveg = "";
        try{
            Scanner f = new Scanner(new File("valaszok.txt"));
            while(f.hasNextLine()){
                szoveg = f.nextLine();
                if (szamlalo == -1) {
                    joValasz = szoveg;
                } else if(szamlalo >= 0) {
                    versenyzoSeged = szoveg.split(" ")[0];
                    valaszokSeged = szoveg.split(" ")[1];
                    versenyzok[szamlalo] = versenyzoSeged;
                    valaszok[szamlalo] = valaszokSeged;
                }
                szamlalo++;
            }
        }catch(FileNotFoundException fnfe){
            System.err.println(fnfe.getMessage());
        }
        System.out.println("1. feladat: A beolvasás sikeres.");
    }
       
    
    public static void masodik(){
        System.out.print("2. feladat: ");
        System.out.println("A vetélkedőn "+szamlalo+" versenyző indult.");
    }
    public static void harmadik(){
        System.out.println("3. feladat: ");
        Scanner sc = new Scanner(System.in);
        String azon = sc.nextLine();
        boolean joe = false;
        int i = 0;
        while(i < szamlalo && joe == false){
            if (versenyzok[i].equals(azon)) {
                valasz = valaszok[i];
                joe = true;
            }
            i++;
        }
        
        System.out.print("A versenyző azonosítója: "+azon+"\n"+valasz+"\t( a versenyző válasza )\n");
    }
    public static void negyedik(){
        System.out.println("4. feladat: ");
        System.out.println(joValasz+"\t( a helyes megoldás )");
        for (int j = 0; j < joValasz.length(); j++) {
            if (joValasz.charAt(j) == valasz.charAt(j)) {
                System.out.print("+");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\t( a versenyző helyes válaszai )\n");
        
    }
    public static void otodik(){
        System.out.print("5. feladat: ");
        Scanner sc = new Scanner(System.in);
        int sorsz = sc.nextInt()-1;
        
        System.out.println("A feladat sorszáma: "+sorsz);
        int helyes = 0;
        
        for (int i = 0; i < szamlalo; i++) {
            if (valaszok[i].charAt(sorsz) == joValasz.charAt(sorsz)) {
                helyes++;
            }
        }
        double szazalek = (double)(((double)helyes/(double)szamlalo)*100);
        Format f = new DecimalFormat("#.##");
        System.out.println("A feladatra "+helyes+"fő, a versenyzők "+f.format(szazalek)+
                "%-a adott helyes választ.");
    }
    public static void hatodik(){
        System.out.print("6. feladat: ");
        int pont = 0;
        for (int i = 0; i < szamlalo; i++) {
            for (int j = 0; j < joValasz.length(); j++) {
                if (valaszok[i].charAt(j) == joValasz.charAt(j)) {
                    if (j < 5) {
                        pont = pont + 3;
                    }else if (j >= 5 && j < 10){
                        pont = pont + 4;
                    }else if (j >= 10 && j < 13) {
                        pont = pont + 5;
                    } else {
                        pont = pont + 6;
                    }   
                }
            }
            pontok[i] = pont;
        }
        
        
    }
    public static void hetedik(){
        System.out.print("7. feladat: ");
    }
}
