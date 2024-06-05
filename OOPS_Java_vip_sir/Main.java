
class Person{
    String name;
    int age;


    public Person(String name, int age){
        this.name=name;
        this.age= age;
    }
    public void displayInfo(){
        System.out.println("A person name is:" +name);
        System.out.println("A person age is:" +age);
    }

}

public class Main{
    public static void main(String[] args){
        Person person1= new Person("Rishav",22);
        person1.displayInfo();
    }
}

