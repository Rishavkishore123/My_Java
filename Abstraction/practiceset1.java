 abstract class Shape{
    public void displayRule(){
        System.out.println("Consistency is necessary for coding!!");
    }

   abstract public void draw();

}

class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }

}

class Rectangle extends Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

public class practiceset1{
    public static void main(String[] args){
        Shape obj1=new Circle();
        obj1.draw();

        Shape obj2=new Rectangle();
        obj2.draw();
        obj2.displayRule();
        
    }
}

// If any method does have the abstract method then its must be class to be abstract it's a rule of abstratcion.