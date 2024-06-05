package FileHandling;
import java.io.File;
public class Delete_File {
    public static void main(String[] args) {
        File myfile= new File("orange.txt");
        if(myfile.delete())System.out.println("File Deleted Successfully");
        else System.out.println("Not deleted");
    }
    
}
