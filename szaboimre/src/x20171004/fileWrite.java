/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171004;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Tanulo
 */
public class fileWrite {
    public static void main(String[] args) throws Exception {
         try {
            FileWriter theFile = new FileWriter("output.txt");
            BufferedWriter write = new BufferedWriter(theFile);
            
             for (int i = 1; i <= 90; i++) {
                 write.write(Integer.toString(i)+" ");
                 if (i % 10 == 0) {
                     write.newLine();
                 }
             }
             write.close();
        } catch (Exception e) {
             System.out.println("I/O hiba: "+e.getMessage());
        }
    }
}
