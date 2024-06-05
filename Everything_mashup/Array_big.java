import java.util.*;
public class Array_big {
    public static int findLargest(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
                
            }
        }
         return largest;
    }
    public static void main(String args[]){
        int number[]={5,15,18,9};
        System.out.println("The largest Number found at:"+findLargest(number));

    }
}
