class Fruits{
    String name;
    int price;


    public Fruits(String name, int price){
        this.name=name;
        this.price=price;
    }

    public void displayInfo(){
        System.out.println("The name of fruit " + name);
        System.out.println("The price of fruit "+ price);
    }
}

