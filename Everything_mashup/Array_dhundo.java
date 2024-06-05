import java.util.*;
public class Array_dhundo {
    public static int binarySearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                 start=mid+1;
            }else{
                 end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        int key=20;
        System.out.println("The number found at idx:" + binarySearch(numbers, key));
    }
}
