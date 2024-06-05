interface Calculator{
    int add(int num1,int num2);
    int sub(int num1,int num2);
}

class Calc implements Calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int sub(int num1,int num2){
        return num1-num2;
    }
}

public class practiceset2{
    public static void main(String[] args){
        Calculator c1= new Calc();
      System.out.println(c1.add(20,10));
    }
}