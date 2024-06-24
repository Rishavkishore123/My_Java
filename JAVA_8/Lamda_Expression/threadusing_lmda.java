package JAVA_8.Lamda_Expression;

class Myclass implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++)
        System.out.println("This is the page to reload the file");
    }
}
public class threadusing_lmda {
    public static void main(String[] args) {
        Runnable runnable=() ->{
            for(int i=0;i<=10;i++){
                System.out.println("Hello "+i);
            }
        };

        Thread childThread= new Thread(runnable);
        childThread.run();
    }
}



