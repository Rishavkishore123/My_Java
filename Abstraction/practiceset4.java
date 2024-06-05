abstract class Fruits{
    public void setRule(){
        System.out.println("Fruits is good for health");
    }

    abstract public void displayInfo();
}

class Mango extends Fruits{
    public void displayInfo(){
        System.out.println("Mango is a faavourite fruit");
    }
}

class Apple extends Fruits{
    public void displayInfo(){
        System.out.println("Apple is a healthy fruits");
    }
}

public class practiceset4{
    public static void main(String[] args){
        Fruits f1= new Mango();
        f1.displayInfo();
        Fruits a1= new Apple();
        a1.displayInfo();
    }
}

