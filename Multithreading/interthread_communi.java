package Multithreading;


    class SharedResource {
        private int data;
        private boolean available = false;
    
        public synchronized void produce(int value) {
            while (available) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            data = value;
            available = true;
            System.out.println("Produced: " + data);
            notify();
        }
    
        public synchronized void consume() {
            while (!available) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Consumed: " + data);
            available = false;
            notify();
        }
    }
    
    class Producer implements Runnable {
        private final SharedResource resource;
    
        public Producer(SharedResource resource) {
            this.resource = resource;
        }
    
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                resource.produce(i);
            }
        }
    }
    
    class Consumer implements Runnable {
        private final SharedResource resource;
    
        public Consumer(SharedResource resource) {
            this.resource = resource;
        }
    
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                resource.consume();
            }
        }
    }
    
    public class  interthread_communi  {
        public static void main(String[] args) {
            SharedResource resource = new SharedResource();
            Thread producerThread = new Thread(new Producer(resource));
            Thread consumerThread = new Thread(new Consumer(resource));
    
            producerThread.start();
            consumerThread.start();
        }
    }

