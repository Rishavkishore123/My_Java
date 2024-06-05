public class throw_exception{
    public static void main(String[] args){
        int i=20;
        int j=0;
    try{
        j=18/i;
        // we don't want to j =0; we want only default value if it gets.
        if(j==0){
            throw new ArithmeticException();
        }
       
    }catch(ArithmeticException e){
        j=18/1;
        System.out.println("This is the default value ");
    }catch(Exception e){
        System.out.println("Something went wrong"+e);
    }
   System.out.println(j);
   System.out.println("Bye");
}
}