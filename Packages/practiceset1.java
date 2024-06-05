import tools.*;
import result.*;
import switchon.*;


public class practiceset1 {
    public static void main(String[] args) {
        Adv c1= new Adv();
        Adv c2= new Adv();

        Sub s1= new Sub();
        Div d1=new Div();

        Light l1=new Light();
        
        Fan f1= new Fan();
      
        System.out.println(c1.displayAdd(3,5));
        System.out.println(c2.displayMulti(2,7));
        System.out.println(s1.displaySubtract(4,2));
        System.out.println(d1.displayDiv(6,2));
        l1.displayBulb();
        f1.Havelles();
    }
}