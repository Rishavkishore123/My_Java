package Multithreading;

class D implements Runnable{
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.println("Hii");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    
}
class E implements Runnable{
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.println("Caring");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
public class practiceset2_implements {
    public static void main(String[] args) {
        Runnable d1=new D();
        Runnable e1=new E();

        Thread t1= new Thread(d1);
        t1.start();

         Thread t2= new Thread(e1);
         t2.start();
    }
    

    // a1.start();
    // b1.start();  why we did not write this because in implements there is no thread class we have to
    // make a thread object to run the multithreading
}
