class Fruits{
    private int price;
    private String fruit_name;

    public void setPrice(int price){
        this.price=price;


    }
    public int getPrice(){
        return price;
    }

    public void setFruitName(String fruit_name){
        this.fruit_name=fruit_name;
    }
    public String getFruitName(){
        return fruit_name;
    }
}

public class practice2{
    public static void main(String[] args){
        Fruits f1=new Fruits();
        f1.setPrice(30);
        f1.setFruitName("Mango");

        System.out.println("The name of fruit is: "+f1.getFruitName());
        System.out.println("The price of fruit is: "+f1.getPrice());
    }
}
