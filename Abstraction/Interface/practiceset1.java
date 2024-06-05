interface A{
    void show();
    void rule();
}

class B implements A{
     public void show(){
        System.out.println("Show your energy");
    }

    public void rule(){
        System.out.println("Rule is important");
    }
}

public class practiceset1{
    public static void main(String[] args){
        B obj1=new B();
        obj1.show();
        obj1.rule();
    }
}