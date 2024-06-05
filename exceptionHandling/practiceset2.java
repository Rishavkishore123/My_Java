public class practiceset2{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(arr[1]);

        
        try{
            System.out.println(arr[20]);
        }
        finally{
            System.out.println(arr[0]);
        }
        
    }
}


// if we dont we want to catch the exception we use finally keyword ... although it run
// the all code then it throw the exception.