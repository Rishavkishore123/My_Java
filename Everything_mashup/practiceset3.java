import java.util.*;
public class practiceset3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int lastdigit=n%10;
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit +"");
            n=n/10; 
        }
    }
}
