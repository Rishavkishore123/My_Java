package FileHandling;

import java.io.File;
import java.io.IOException;

public class creating {
    public static void main(String[] args) {
        File myFile= new File("C:\\Users\\Rishav\\Desktop\\My_Java\\exceptionHandling\\filename.txt");
        try {
           if( myFile.createNewFile()){
            System.out.println("File created Successfully:"+myFile.getName());
           }else{
            System.out.println("File already exist");
           }
        } catch (IOException e) {
            
            e.printStackTrace();
            System.out.println("Unable to create this file");
        }
    }
}
