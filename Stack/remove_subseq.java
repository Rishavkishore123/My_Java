package Stack;
import java.util.*;

public class remove_subseq {
    public static int[] removeSubsequence(int[] arr){
        Stack <Integer> stac= new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
           
            if(stac.isEmpty() || stac.peek()!=arr[i]) stac.push(i);
            
            else if (arr[i]== stac.peek()){
                if(i==n-1 || arr[i]!=arr[i+1] ) stac.pop();
            }
        }

        int [] res= new int[stac.size()];
        int m=res.length;
        for(int i=m-1;i>=0;i--){
            res[i]=stac.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,10,10,10,4,4,5,7,7};
        int [] res=removeSubsequence(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}

//There is something error please do not consider this code