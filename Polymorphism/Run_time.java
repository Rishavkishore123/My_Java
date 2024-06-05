// Run time only occurs by the help of overriding

class Vehicle{
    public void displayInfo(){
        System.out.println("Vehicle is good for long routes");
    }
}

class Bike extends Vehicle{
    public void displayInfo(){
        System.out.println("My fav bike is Ninja_h2r");
    }
}

public class Run_time{
    public static void main(String[] args){
        Vehicle v1=new Vehicle();
        v1.displayInfo();
        Bike b1=new Bike();
        b1.displayInfo();
    }
}