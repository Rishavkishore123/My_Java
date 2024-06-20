package JAVA_8.Functional_Interface;

@FunctionalInterface
interface C{
    void run(int i,int j, String c);
    
}


public class practiceset2 {
    public static void main(String[] args) {
        C obj3= new C() 
        {
            public void run(int i,int j, String name){
                int sum= i+j;
                System.out.println("running page " +sum + " "+name);
            }
        };
       obj3.run(5,8,"All girls ");
    }
}

   //Functional Interface is defined as there is a one public abstract method Fir Interface kpo defined kr dena
   //It can have many number of default static methods
   //--> ok, let's see


