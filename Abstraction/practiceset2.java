abstract class Alcohol{
    public void displayInfo(){
      System.out.println("Alcohol is good for health");
    }

   abstract public void peeyo();


}

class Beer extends Alcohol{
    public void peeyo(){
        System.out.println("In Summer you have to  drink beer");
    }
    
}

class Gaanza extends Alcohol{
    public void peeyo(){
        System.out.println("Gaaanza increases the focus of mind");
    }
}


public class practiceset2{
    public static void main(String[] args){
        Alcohol godfather= new Beer();
        godfather.peeyo();


        Alcohol redlevel= new Beer();
        redlevel.peeyo();
        redlevel.displayInfo();

        Alcohol gaaanza=new Gaanza();
        gaaanza.peeyo();

    }
}