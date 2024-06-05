class Shape{
    public void draw(){
        System.out.println("Draw your own favourite Shape");
    }

}

class Circle extends Shape{
    public void draw(){
        System.out.println("Draw circle");

    }
    public void erase(){
        System.out.println("Erase the circle");
    }
}

class Rectangle extends Shape{
    public void draw(){
        System.out.println("Draw the rectangle");
    }

    public void erase(){
        System.out.println("Erase the rectangle");
    }
}

class Triangle extends Shape{
    public void draw(){
        System.out.println("Draw the triangle");
    }

    public void erase(){
        System.out.println("Erase the triangle");
    }
}


public class practiceset3{
    public static void main(String[] args){
        Circle c1= new Circle();
         c1.draw();
        c1.erase();

        Rectangle r1= new Rectangle();
        r1.draw();
        r1.erase();

        Triangle t1= new Triangle();
        t1.draw();
        t1.erase();
    }
}