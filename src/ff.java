import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ff {
    
    public static void FirstMenu(){
        System.out.println("\n****************************************************************************\n**     Welcome to the File management system please choose your option:   **\n**        1: Show my files                                                **\n**        2. More option                                                  **\n**        3. Exit                                                         **\n");
    }
    public static void SecondMenu(){
        System.out.println("\n**     Please choose your option:                                          **\n**        1: Add new File                                                  **\n**        2. Delete File                                                   **\n**        3. Search                                                        **\n**        4. Back                                                          **\n**");
    }

    public static void SecondOption(){
        try {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        SecondMenu();
        
        System.out.println("Enter your choice");
        String num = input.nextLine(); 
        int i=Integer.parseInt(num); 
        
            switch (i) {
                case 1:
                    System.out.println("1");
                    System.out.println("Enter your choice");
                    num = input.nextLine();
                    i=Integer.parseInt(num);
                    System.out.println("finsh 1");
                    SecondOption();
                break;
                case 2:
                    System.out.println("1");
                    System.out.println("Enter your choice");
                    num = input.nextLine();
                    i=Integer.parseInt(num);
                    System.out.println("finsh 2");
                    SecondOption();
                break;

                case 3:
                    System.out.println("3");
                    System.out.println("Enter your choice");
                    num = input.nextLine();
                    i=Integer.parseInt(num);
                    System.out.println("finsh 3");
                    SecondOption();
                break;       
                case 4:
                System.out.println("4");
                HomeMenu(); 

                 break; 
                default:
                    System.out.println("Please write number  1, 2, 3, or 4");
                    System.out.println("Enter your choice");
                    num = input.nextLine();
                    i=Integer.parseInt(num); 
                    System.out.println("finsh else");
                    SecondOption();
                    break;
            }
            
            
        
    } catch (Exception e) {
        System.out.println("Please write number only");
        SecondOption();
    } 
    }



    public static void HomeMenu(){
        try {
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        FirstMenu();
        System.out.println("HomeMenu Enter your choice");
        String num = input.nextLine(); 
        int i=Integer.parseInt(num); 
        while (i != 3) {
           
            if(i==1){
                System.out.println("1");
                System.out.println("Enter your choice");
                num = input.nextLine();
                i=Integer.parseInt(num); 
            }
            else if (i==2){
             
                
                    SecondOption();
           
                    HomeMenu();
                        
            

            }
            else {
                System.out.println("Please write number  1,  2,or 3");
                HomeMenu();
            }
        }             
        System.out.println("Thank you for use our System :) \n****************************************************************************\n");
        
    } catch (Exception e) {
        System.out.println("Please write number only");
        HomeMenu();
    }   
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
            try {
                HomeMenu();
                

            } catch (Exception e) {
                System.out.println("Please write number only");
                HomeMenu();
            }   
    }
}