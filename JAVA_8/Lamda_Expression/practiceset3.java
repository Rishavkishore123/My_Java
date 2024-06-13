package JAVA_8.Lamda_Expression;

@FunctionalInterface
interface F{
    int multiply(int n1,int n2);
}
public class practiceset3 {
    public static void main(String[] args) {
        F f1=(num1,num2)->
        {   
            int total=num1*num2;
           return total;
        };
        int result=f1.multiply(3, 2);
        System.out.println(result);
    }
}
