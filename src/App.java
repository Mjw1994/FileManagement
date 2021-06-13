import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

public class App {

    public static void menu(){
            System.out.println("Welcom to the gghvhmvm please choose your option \n 1: Add \n Delect");
    }
    public static void main(String[] args) {
    try {

        Scanner input = new Scanner(System.in); 
        menu();
        
        String NameFile = input.nextLine();
        //System.out.println("The Director of file is "+NameFile);
        File f = new File (NameFile); 
        for (int i=0; i<f.listFiles().length; i++){
            System.out.println(f.listFiles()[i].getName());
        }
        
            
 
        
    } catch (Exception ex) 
         {
         System.out.println(ex.getMessage());    
         }
    }
    

}