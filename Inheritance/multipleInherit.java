// Multiple Inheritance does not support java but it can be achieved by interfaces


interface A{
    int methodA();
}
interface B{
    void methodB();

}

class Multiple implements A,B{
    public void methodA(){
        System.out.println("Method A");
    }
    public void methodB(){
        System.out.println("method B");
    }
}

public class multipleInherit{
    public static void main(String[] args){
        Multiple m1= new Multiple();
        m1.methodA();
        m1.methodB();
    }
}