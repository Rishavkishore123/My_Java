package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class practiceset2 {
    public static void main(String[] args) {
        try{
        FileWriter myWriter1= new FileWriter("C:\\Users\\Rishav\\Desktop\\My_Java\\exceptionHandling\\filename.txt");
        myWriter1.write("Kya sb kchh shi se likha rhe h tb toh badhiya h bhai");
        myWriter1.close();
        System.out.println("Writing sucessfully");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
