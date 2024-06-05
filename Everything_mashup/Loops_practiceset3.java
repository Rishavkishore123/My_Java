import java.util.*;
public class Loops_practiceset3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int sum=i*(i+1)/2;
            System.out.print(sum+" ");
            i++;
        }
    }
}
