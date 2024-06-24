package JAVA_8.Functional_Interface;

@FunctionalInterface
interface Boy{
    public void Love();

    default void Girl(){
        System.out.println("Love with Boys");
    }

    default int sayHello(int num1,int num2){
        int total=num1+num2;
        return total;
    }
}


public class Default_func  {
    public static void main(String[] args) {
        Boy b1=new Boy()
        {
           public void Love(){
            System.out.println("Don't fall in Love");
           }
        };
        b1.Love();
        b1.Girl();
        System.out.println(b1.sayHello(7, 8));
  
    }
}
