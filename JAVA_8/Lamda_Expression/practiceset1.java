package JAVA_8.Lamda_Expression;

@FunctionalInterface
interface D{
    void sum(int num1, int num2);
}
public class practiceset1 {
    public static void main(String[] args) {
        D d1=(n1,n2)->
        {   
            int total=n1+n2;
            System.out.println("This is the page to adding the two numbers");
            System.out.println(total);
           
        };
        d1.sum(4,5);
            
        
    }
}
