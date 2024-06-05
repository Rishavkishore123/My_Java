class Animal{
    String name;
    String color;

    public Animal(String name, String color){
        this.name=name;
        this.color=color;
    }

    public void displayInf(){
        System.out.println("The animal name is: "+name);
        System.out.println("The animal color of lion is: "+color);
    }


}

class Ipl extends Animal{
    String fav_team;
    

    public Ipl( String name ,String color,String fav_team){
        super(name,color);
        this.fav_team=fav_team;
    }

    public void displayData(){
        System.out.println("My Favourite team is :"+fav_team);
    }


}

public class Super{
    public static void main(String[] args){
        Ipl team1=new Ipl("Lion","Yellow","CSK");
        team1.displayInf();
        team1.displayData();
    }
}