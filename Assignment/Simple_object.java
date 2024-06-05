class Books{
    int price;
    String name;

    public Books(int price, String name){
        this.name=name;
        this.price=price;
    }

    public void displayInfo(){
        System.out.println("price of book "+price);
        System.out.println("name of book "+name);

    }

}

public class Simple_object{
    public static void main( String[] args){
        Books book1= new Books(45,"Java");
        book1.displayInfo();
    }
}
