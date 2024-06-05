package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class preacticeset3 {
    public static void main(String[] args) {
        try {
            BufferedReader read=new BufferedReader(new FileReader("C:\\Users\\Rishav\\Desktop\\My_Java\\exceptionHandling\\practiceset1.java"));
            String str;
            while((str=read.readLine())!=null){
                System.out.println(str);
            }
        } catch (Exception e) {
            System.out.println("Error has been occured");
        }
        
    }
}
