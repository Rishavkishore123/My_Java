package Multithreading;


class A extends Thread
{

    public void run(){
        for(int i=1;i<=50;i++){
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
        for(int i=1;i<=50;i++){
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



public class practiceset1_extends {
    public static void main(String[] args) {
        A a1=new A();
        B b1= new B();
        a1.start();
        b1.start();

       // a1.setPriority(Thread.MIN_PRIORITY); 
        //b1.setPriority(Thread.MAX_PRIORITY);

        // System.out.println(a1.getPriority());
        // System.out.println(b1.getPriority());
       // System.out.println(c1.getPriority());
    }
    
}
