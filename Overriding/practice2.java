class Teachers{
    String name;
    String subject;

    public Teachers(String name, String subject){
        this.name=name;
        this.subject=subject;
    }

    public void displayInfo1(){
        System.out.println("The name of teacher is rishav sir"+name);
        System.out.println("I am teaching  "+subject);
    }
}

class Student extends Teachers{
    String studentname;
    String fav_sub;

    public Student(String studentname, String sub, String name, String subject){
        super(name,subject);
        this.studentname=studentname;
        this.fav_sub=fav_sub;
        
    }
 

    public void displayInfo1(){
         System.out.println("name of student is  "+name);
         System.out.println("name of student is  "+subject);
        System.out.println("name of student is  "+studentname);        
        System.out.println("they mostly like  "+fav_sub);

    }


}


public class practice2{
    public static void main(String[] args){
        Teachers t1=new Teachers("vipin sir","java");
        t1.displayInfo1();

        Student s1= new Student("jigyasa","dsa","APPURVA","java");
        s1.displayInfo1();
    }
}