class Fruits{
    public void setData(int num){
        System.out.println("Fruit is good for health"+num);

    }

    public void displayInf(){
        System.out.println("But people don't eat fruits, they always eat junk food");
    }
}

class People extends Fruits{
    public void peopBehaviour(){
        System.out.println("They eat fruits, when they feel weak");
    }
}

public class Inherit{
    public  static void main(String[] args){
        People p1= new People();
        
        p1.displayInf();
        p1.peopBehaviour();
    }
}