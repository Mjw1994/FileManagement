import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void menu(){
            System.out.println("****************************************************************************\n**     Welcome to the File management system please choose your option:   **\n**        1: Show my files                                                **\n**        2. More option                                                  **\n****************************************************************************\n");
    }
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        String path = "C:"; 
        String path2 =""; 

        String NameFile = "Project_Manager";
        String f1 = "f1.docx";
        path=path+NameFile;
        path2=path+"\\"+f1;
        System.out.println(path2);



        File file = new File(NameFile);
        File file2 = new File(path2);
       
      //Creating the directory
       boolean directory = file.mkdir();
 

       try {
       if(directory){
        if (file2.createNewFile()){
            System.out.println("okkk");
    
           }
           else {
            System.out.println("wrong");
    
           }
    



     }else{
        System.out.println("file 1 not find");
     }
     

    
    

        //System.out.println("The Director of file is "+NameFile);
        File f = new File (path); 
        File FileList[]=f.listFiles();
        Arrays.sort(FileList);
        
        for (int i=0; i<FileList.length; i++){
            System.out.println(FileList[i].getName());
        }
        System.out.println("ho");
        
 
        
    } catch (Exception ex) 
         {
         System.out.println("The File name "+NameFile+" not Found ");    
         }
    }
    

}