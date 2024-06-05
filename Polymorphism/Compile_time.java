// we know compile time occurs only by the help of  overloading 

class Friend{
    

    public void displayInf(){
        System.out.println("Making a good friends in life");
    }


    public void displayInf(String name){
        System.out.println("My friend name: "+name+" , he is a good man bro ");
    }


}
public class Compile_time{
    public static void main(String[] args){
        Friend f1=new Friend();
        f1.displayInf("Rishav");
    }
}