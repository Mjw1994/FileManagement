import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void FirstMenu(){
        System.out.println("\n**************************************************************************************\n**     Welcome to the File Management System please choose your option:             **\n**        1: Show content of Files Manager                                          **\n**        2. More option                                                            **\n**        3. Exit                                                                   **\n");
    }
    public static void SecondMenu(){
        System.out.println("\n**       Please choose your option:                                                   **\n**        1: Add new File                                                           **\n**        2. Delete File                                                            **\n**        3. Search                                                                 **\n**        4. Back                                                                   **\n**");
    }

    public static void SecondOption(){
        try {
            Scanner input = new Scanner(System.in);  // Create a Scanner object
            SecondMenu();
            
            System.out.println("**     Enter your choice :                                                          **");
            String num = input.nextLine(); 
            int i=Integer.parseInt(num); 
            
                switch (i) {
                    case 1:
                    System.out.println("\n**     1.Create Folder      2.Create File                                           **");
                    num = input.nextLine();
                    i=Integer.parseInt(num);                    
                    switch (i) {
                        case 1:
                        System.out.println("**     Enter Name of Folder :                                                       **");
                        num = input.nextLine();

                        String path11 = "c:\\File Management System\\"+num; 

                        File file11 = new File(path11);
                                         
                        
                         if(file11.exists()){
                            
                             if (file11.isDirectory()){
                           
                                 if (file11.list().length > 0) {
                                     System.out.println("Directer create at path : "+path11);
                 
                                 } else {
                                 System.out.println("The directory " + file11.getPath() + " is already exist please check from ");
                                 showFileManger();
                                 SecondOption();
                                 }
                            }         
                         }
                         else {
                             file11.mkdir();
                             System.out.println("**     Directer has been at path : "+path11+"                          **");
                             if (file11.isDirectory()){
                                System.out.println("**     The directory " + file11.getPath() + " created successfully ");
                                showFileManger();
                                SecondOption();
                            }         
                         }
                        break;

                        case 2:
                        System.out.println("**     Enter Name and type of file                                                  **");

                        String path = "c:\\File Management System"; 
                        File file = new File(path);
                        
                        String FileName = input.nextLine();
                        String stor = path+"\\"+FileName;
                
                        File file1 = new File(stor);
                        file1.createNewFile();
                                            
                        showFileManger();
                        SecondOption();
                        break;
                        
                        default:
                        System.out.println("**     Please write number  1 or 2                                                  **");
                        System.out.println("**     Enter your choice :                                                          **");
                        num = input.nextLine();
                        i=Integer.parseInt(num); 
                        SecondOption();
                        break;

                    }
                    break;
    
                    case 2:
                        showFileManger();

                        System.out.println("**     Enter file name to delete it                                                 **");
                        
                        String path2 = "c:\\File Management System"; 
                        File file2 = new File(path2);
                        String FileName2 = input.nextLine();
                        String stor2 = path2+"\\"+FileName2;
                        
                        File file3 = new File(stor2);
                        if (file3.delete()){
                        System.out.println("**     The File (( "+FileName2+" )) got deleted                                            **");
                        showFileManger();
                        SecondOption();
                        }
                        else {
                            System.out.println("**     The File "+FileName2+" not Found                                            **");

                        }                  
                        SecondOption();
                    break;
    
                    case 3:
                        System.out.println("**     Enter Folder name or file name with type for search                          **");                       
                        num = input.nextLine();
                        String path11 = "c:\\File Management System\\"+num; 
                        File file11 = new File(path11);
                                      
                        
                         if(file11.exists())
                         {
                            
                             if (file11.isDirectory())
                                {
                           
                                 System.out.println("**     The directory of (( " +num+" )) directory is (( "+ file11.getPath() + " ))   **");
                               
                                 SecondOption();
                                 }
                            else if (file11.isFile()){
                           
                                    System.out.println("**     The directory (( " +num+" )) file is (( "+ file11.getPath() + " ))           **");
                                  
                                    SecondOption();
                                    }
                        }
                        else {
                            System.out.println("**     The directory of (( " +num+" )) not found                                    **");
                            SecondOption();

                               
                        }         
                        
                    break; 
    
                    case 4:
                        HomeMenu(); 
                    break; 
    
                    default:
                        System.out.println("**     Please write number  1, 2, 3, or 4                                           **");
                        System.out.println("**     Enter your choice :                                                          **");
                        num = input.nextLine();
                        i=Integer.parseInt(num); 
                        SecondOption();
                        break;
                }
             } catch (Exception e) {
                    System.out.println("**     Please write number only                                                     **");
                    SecondOption();
        }
    }



    public static void HomeMenu(){
        try {
            Scanner input = new Scanner(System.in);  // Create a Scanner object
            FirstMenu();
            String num ="";
            System.out.println("**     Enter your choice :                                                          **");
             num = input.nextLine(); 
            int i=Integer.parseInt(num); 
            
            switch (i) {
                case 1:
                showFileManger();
                HomeMenu(); 
                break;
    
                case 2:             
                    SecondOption();
                break;
    
                case 3:
                break; 
                   
                default:
                    System.out.println("**     Please write number  1,  2,or 3                                              **");
                    HomeMenu();
                break;
             }
              } catch (Exception e) {
                System.out.println("**     Please write number only                                                     **");
                HomeMenu();
             } 
    }
    public static void showFileManger(){
        String path = "c:\\File Management System"; 
        File f = new File (path); 
                
            if (f.isDirectory()){
          
                if (f.list().length > 0) {

                System.out.println("**     The files in this directory (( " + f.getPath() + " )) are content :    **");
                File FileList[]=f.listFiles();
                    Arrays.sort(FileList);     
                    for (int i=0; i<FileList.length; i++){
                        int number=i+1;
                        System.out.println("**        "+number+"."+FileList[i].getName()+"                                                                     **");
                        number++;
                    }
                } else {
                System.out.println("**     The files in this directory (( " + f.getPath() + " )) are empty        **");
                }
           }         
    }
    
    public static void createFileManger()throws IOException{
        String path = "c:\\File Management System"; 
        File file = new File(path);
       
        if(file.exists()){
           
            if (file.isDirectory()){
          
                if (file.list().length > 0) {
                    System.out.println("Directer create at path : "+path);

                } else {
                System.out.println("The directory " + file.getPath() + " is empty");
                }
           }         
        }
        else {
            file.mkdir();
            System.out.println("Directer has been at path : "+path);
            if (file.isDirectory()){
          
                if (file.list().length > 0) {
                System.out.println("The directory " + file.getPath() + " is not empty");
                } else {
                System.out.println("The directory " + file.getPath() + " is empty");
                }
           }         
        }
        }
    

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        try {
            createFileManger();
           
            HomeMenu();

        } catch (Exception e) {
            System.out.println("**     Please write number only                                                     **");
            //HomeMenu();
        }   
        System.out.println("**     Thank you for use our System :)                                              **\n**************************************************************************************\n");

    }
    

}
