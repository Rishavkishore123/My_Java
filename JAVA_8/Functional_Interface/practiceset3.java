package JAVA_8.Functional_Interface;

interface F{
    int mul(int n1,int n2);
}
public class practiceset3 {
    public static void main(String[] args) {
        F f1= new F() 
        {
            public int mul(int num1,int num2){
            return num1*num2;
        }
    };
       int result= f1.mul(4,6);
       System.out.println("The multiply of this result :"+ result);
    }
}
