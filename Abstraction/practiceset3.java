abstract class Ipl{
    public void displayInfo(){
        System.out.println("Tell me the  name of your favourite team  ");
    }
    abstract public void favteam();
}

class Teams extends Ipl{
        public void favteam(){
            System.out.println("My favourite team is CSK");
        }
}

public class practiceset3{
    public static void main(String[] args){
        
        Ipl t1=new Teams();
        t1.displayInfo();
        t1.favteam();
    }
}