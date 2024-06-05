

public class Static{
    static int x=12;
    static int y;

    static void func(int z){
        System.out.println("X= "+x);
        System.out.println("Y= "+y);
        System.out.println("Z= "+z);
    }

    static{
       System.out.println("Running initialization block");
       y=x+5;
    }

    public static void main(String[] args){
        func(8);
    }
}