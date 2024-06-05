package FileHandling;

import java.io.File;
import java.io.IOException;

public class practiceset1 {
    public static void main(String[] args) {
        File myflie= new File("mango.txt");
        try {
            if(myflie.createNewFile()) System.out.println("file created successfully");
            else System.out.println("File exists");
        } catch (IOException e) {
            
            e.printStackTrace();
            System.out.println("An error has occured"+e.getMessage());
        }
    }
}
