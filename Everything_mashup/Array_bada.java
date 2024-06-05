import java.util.*;
public class Array_bada {
    public static int largestnumber(int numbers[]){
        int Largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        //for(int i=0;i<numbers.length;i++){
          //  if(largest<numbers[i]){
            //    largest=numbers[i];
            //}
        for( int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
        //return largest;
    }
    public static void main(String args[]){
        int numbers[]={5,6,8,9,4};
        System.out.println("smallest no. should be:"+largestnumber(numbers));
        //int idx=largestnumber(numbers);
        //System.out.println("The largest number:"+idx);
    }
}
