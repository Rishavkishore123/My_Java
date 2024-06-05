package Multithreading;


class A extends Thread
{

    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

class B extends Thread
{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class C extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Love");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class practiceset1_extends {
    public static void main(String[] args) {
        A a1=new A();
        B b1= new B();
        C c1= new C();
        a1.start();
        b1.start();
        c1.start();

        // System.out.println(a1.getPriority());
        // System.out.println(b1.getPriority());
        // System.out.println(c1.getPriority());
    }
    
}
