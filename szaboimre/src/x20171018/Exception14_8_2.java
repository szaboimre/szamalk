/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171018;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Tanulo
 */
public class Exception14_8_2 {

    public static void main(String[] args) {
        int szam;
        int sum = 0;
        String szum = "", actual;
        String hibasadatok = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek több egész számot vesszővel elválasztva!");
        String sor = sc.nextLine();

        StringTokenizer st = new StringTokenizer(sor, " ");
        //int db = st.countTokens();
        int db = 0;
        while (st.hasMoreTokens()) {
        try {
            actual = st.nextToken();
            szam = Integer.parseInt(actual);
            sum += szam;
            szum = actual+"+";
            db++;
        } catch (Exception e) {
            hibasadatok= e.getMessage().split(":")[1].trim().replace("\"","")+";";
        }
        }
        System.out.println("A beolvasott számok (" + db + ") db összege: " + sum);
        szum = szum.substring(0, szum.length()-1);
        szum += "="+sum;
        System.out.println("AZ összeadás: "+szum);
        System.out.println("Hibás adatok: "+hibasadatok);
    }
}
