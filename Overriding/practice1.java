class A{
    
   

    public void method1(){
        System.out.println("This is the class of method 2 of class A");
    }
}

class B extends A{
    public void method1(){
        System.out.println("This is the class of method 2 of class B");
    }
   
}

public class practice1{
    public static void main(String[] args){
        A b= new B();
        b.method1();
    }
}
