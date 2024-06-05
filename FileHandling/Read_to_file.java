package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_to_file {
    public static void main(String[] args) {
        try{
        BufferedReader reader= new BufferedReader(new FileReader("mango.txt"));
        String line;
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("error has been occured");

        }
    }
}
