
class Fruits{
    int price;
    String fruit_name;
    String fav_fruit;



    public Fruits(int price, String fruit_name, String fav_fruit){
        this.price=price;
        this.fruit_name=fruit_name;
        this.fav_fruit=fav_fruit;
    }

     public Fruits(String string, int i) {
        //TODO Auto-generated constructor stub
    }

    public void displayFruits(){
       System.out.println("The fruit of price is:"+ price);
        System.out.println("The name of fruit is :"+ fruit_name);
        System.out.println("What is your fav_fruit?"+ fav_fruit );
    }


}

public class Student{
    public static void main(String[] args){
        Fruits fruits1= new Fruits(50,"Apple","Mango");
        fruits1.displayFruits();
    }
}