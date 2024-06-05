import java.io.FileReader;
import java.io.IOException;

public class checked_exception{
    public static void main(String[] args){
        try{
            FileReader file= new FileReader("abc.txt");
        }catch(IOException e){
            System.out.println("Someetnig went wrong"+e);
        }

    }
}


