package FileHandling;

import java.io.File;
import java.io.IOException;

public class practiceset4 {
    public static void main(String[] args) {
        File myfile= new File("orange.txt");
        
        try{
            
            if(myfile.createNewFile()) System.out.println("File created succeessfully");
            else System.out.println("File exists");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("An errror has been occured"+e.getMessage());
        }
        
    }
}
