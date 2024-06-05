import java.util.*;
public class Arrayys_Search {
public static int linearSearch(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
        if(numbers[i] ==key){
            return i;
        }
    }
         return -1;
}

   public static void main(String args[]){
    int numbers[]={2,4,5,6,65,87,5,4};
    Scanner sc=new Scanner(System.in);
   
    int key=sc.nextInt();
    //int key=65;
    int idx=linearSearch(numbers,key);
    if(idx==-1){
        System.out.println("Not found");
    }else{
        System.out.println("NO. found at idx:"+idx);
    }

   }
}
