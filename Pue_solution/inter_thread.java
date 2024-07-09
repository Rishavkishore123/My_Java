package Pue_solution;

class SharedResource{
    private int data;
    private boolean available=false;
    public synchronized void produce(int value){
        while(available){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

            data=value;
           
            available=true;
            System.out.println("produced:"+data);
            notify();
            
        
    }

    public synchronized void consume(){
        while(!available){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
            System.out.println("consumed:" +data);

            available=false;
            notify();
        
    }
}
class Producer implements Runnable{
    private final  SharedResource resource;
    
    public Producer( SharedResource resource){
        this.resource= resource;
    }

    public void run(){
        for(int i=0;i<=5;i++){
            resource.produce(i);
        }
    }
}
class Consumer implements Runnable{
    private final SharedResource resource;

    public Consumer(SharedResource resource){
        this.resource= resource;
    }

    public void run(){
        for(int i=0;i<=5;i++){
            resource.consume();
        }
    }
}

public class inter_thread {
    public static void main(String[] args) {
        
    
    SharedResource resource= new SharedResource();
    Thread ProducerThread= new Thread(new Producer(resource));
    Thread ConsumerThread= new Thread(new Consumer(resource));

    ProducerThread.start();
    ConsumerThread.start();
    }
}
