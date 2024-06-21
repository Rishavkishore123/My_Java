package JAVA_8.Lamda_Expression;

@FunctionalInterface
interface M{
    public int sum(int n1,int n2);
}
public class practiceset4 {
    public static void main(String[] args) {
        M m1= (num1,num2)->
        {
            int total=num1+num2;
            return total;
        };

       System.out.println( m1.sum(9,8));

    }
}
