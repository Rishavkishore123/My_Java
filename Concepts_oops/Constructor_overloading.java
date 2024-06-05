class Student{
    String name;
    int rollno;
    String sports;
    int rate;
// non parameterized constructor;
    public Student(int rate){
        this.rate=rate;
       
    }

    

    public Student(String name, int rollno, String sports){
        this.name=name;
        this.rollno=rollno;
        this.sports=sports;
    }

    public void displayRate(){
        System.out.println("The rate is "+rate);
    }
    public void displayStu(){
        System.out.println("The name of student is "+name);
        System.out.println("The roll no of student is "+rollno);
        System.out.println("The fav sport of student is "+sports);
       
    }

    

}

// This is called constructor overloading

public class Constructor_overloading{
    public static void main(String[] args){
        Student s1= new Student("Rishav",32,"Cricket");
        Student s2= new Student(98);
        s1.displayStu();
        s2.displayRate();
        

        

    

    }
}

