/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171025;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Tanulo
 */
public class Exception14_8_3 {
    public static void main(String[] args) {
        try{
            File vissza = new File("vissza.txt");
            Scanner sc = new Scanner(vissza);
                          
            String szo = sc.next();
            System.out.println(szo);
            
            StringBuilder sb = new StringBuilder(szo);
            System.out.println(sb.reverse());
            
            
        }catch(IOException ioe){
            System.out.println("Error: "+ioe.getMessage());
        }
    }
    
}
