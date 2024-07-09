package Pue_solution;

class FinalVariable{
    int price;
    String name;
   FinalVariable(int price, String name){
    this.price=price;
    this.name=name;
  }

  final int displayPrice(int price){
        return price;
  }

  final String disaplayString(String name){
        return name;
  }
}


public class practiceset2 {
    public static void main(String[] args) {
        FinalVariable f1= new FinalVariable(0, null);
        System.out.println(f1.displayPrice(30));
        System.out.println(f1.disaplayString("rishav"));
    }
}
