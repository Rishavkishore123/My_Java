public class practiceset1{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(arr[1]);

        
        try{
            System.out.println(arr[20]);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(arr[4]);
        }
        
    }
}


//we can use finally keyword with only try , it will run the last block of code;