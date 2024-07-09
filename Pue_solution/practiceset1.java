package Pue_solution;

class Fruits{
    int price;
    String name;

    public Fruits(int price, String name){
       this.price=price;
       this.name=name;
    }
    
    public void health(){
        System.out.println("Fruits is good for health");
    }

    public int health(int price){
        return price;
    }
    public String health( String name){
        return name;
    }
}


class B extends Fruits{
   public B(int price , String name){
    super(price, name);
   }
    public  void health(){
        System.out.println("Mango is the good fruits");
    }

    public void guave(){
        System.out.println("Guava is good for health");
    }
}

public class practiceset1{
    public static void main(String[] args) {
        
        B f1= new B(10,"apple");
        System.out.println(f1.health("apple"));
        System.out.println(f1.health(10));
        f1.health();
        f1.guave();

        
    }
}