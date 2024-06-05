class Kiet{
    int faculty;
    int age;

    public Kiet(int faculty, int age){
        this.faculty=faculty;
        this.age=age;
    }

    public void setFaculty(int faculty){
        this.faculty=faculty;
    }
    public void setAge(int hostels){
       this.age=age;
    }
    public void displayInfo(){
        System.out.println("No. of faculty "+this.faculty);
        System.out.println("No. of faculty's age "+this.age);

    }
}

public class Keywords{
    public static void main(String[] args){
        Kiet kiet1= new Kiet(300,34);
        
        kiet1.displayInfo();

         Kiet kiet2= new Kiet(34,35);
         kiet2.displayInfo();

    }
}