class Student{
    private String name;
    private int age;
    private String grade;

     public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
      
    }

    public String getGrade(){
        return grade;
    }

    public void setGrade(String grade){
        this.grade=grade;
    }
}

public class practice1{
    public static void main(String[] args){
        Student s1= new Student();
        s1.setName("Rishav");
        s1.setAge(28);
        s1.setGrade("A");
        System.out.println("This is the student name "+s1.getName());
        System.out.println("This is the age of student  "+s1.getAge());
        System.out.println("This is the grade of student "+s1.getGrade());
    }
}