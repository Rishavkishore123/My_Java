package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write_to {
    public static void main(String[] args) {
        try{
        FileWriter myWritter= new FileWriter("mango.txt");
        myWritter.write("Mangoes is good for health");
        myWritter.close();
        System.out.println("Write suceesfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
