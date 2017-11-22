package x20171004;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Tanulo
 */
public class fileRead {
    public static void main(String[] args) throws Exception {
        //Abszolút elérési út
        //File theFile = new File("C:/Users/Tanulo/Documents/NetBeansProjects/nSZF2A1_SzaboImreMario/src/x20171004/input.txt");
        //Relatív elérési út
        //File theFile = new File("src/x20171004/input.txt");
        //Text file a projekt mappában
        File theFile = new File("input.txt");
        try{
            Scanner eyes = new Scanner(theFile);
            while (eyes.hasNextLine()) {                
                String sor = eyes.nextLine();
                System.out.println(sor);
            }
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }
}
