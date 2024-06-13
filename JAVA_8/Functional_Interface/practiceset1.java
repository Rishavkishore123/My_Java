package JAVA_8.Functional_Interface;
@FunctionalInterface
interface A{
     void show();
}
public interface practiceset1 {
public static void main(String[] args) {
   A obj1=new A()
   {
    public void show(){
        System.out.println("This is the page to show");
    }
   };
   obj1.show();
}
    
}