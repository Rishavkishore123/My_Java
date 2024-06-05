class A{
    static{
        
            System.out.println("Display Rule");
        
    }

        {
            System.out.println("This is instance object which runs after static");
        }
}
public class practiceset1{
    public static void main(String[] args){
        A s1=new A();
        A s2= new A();
        
    }
}