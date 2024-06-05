public class try_unchecked_exception{
    public static void main(String[] args){
        int i=5;
        int j=0;
        int k=0;
        

        try{
            k=i/j;
            
                       
        }catch(ArithmeticException e){
            System.out.println("can not divide by zero & also this is the exmple of unchecked exception"+e);
        }

        System.out.println(k);
    }
}
