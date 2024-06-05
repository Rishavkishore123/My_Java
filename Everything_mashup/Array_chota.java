import java.util.*;
public class Array_chota {
    public static int getSmallest(int number[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int number[]={2,5,7,8,9,1,4,5,};
        System.out.println("The smallest no. we got:"+getSmallest(number));
    }
}
