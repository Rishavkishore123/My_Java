public class Method_Overloading{


    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int subtract(int a,int b){
        return a-b;
    }

    public int subtract(int a,int b,int c){
        return a-b-c;
    }

    public static void main(String[] args){
        Method_Overloading calculator=new Method_Overloading();
        System.out.println("The addition of this number: "+calculator.add(5,10));
        System.out.println("The addition of this number: "+calculator.add(5,13,12));
        System.out.println("The subtraction of this number: "+calculator.subtract(50,10));
        System.out.println("The addition of this number: "+calculator.subtract(50,10,20));

    }
}