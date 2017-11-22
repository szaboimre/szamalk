package x20171018;


import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tanulo
 */
public class Exception14_8_1 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.###");        
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj számot!");
        try {
            double szam = sc.nextDouble();
            double ngyok = Math.sqrt(szam);
            if (Double.isNaN(ngyok)) {
                throw new Exception();
            }
            System.out.println("A "+szam+" négyzetgyöke: "+df.format(ngyok));
        }catch(InputMismatchException ime){
            System.out.println("Csak szám lehet.");
        }
        catch(Exception e){
            System.out.println("Negatív nem jó.");
        }
        
    

    }     
}
