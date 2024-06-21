package JAVA_8.Functional_Interface;

@FunctionalInterface
interface z{
    public int sum(int n1,int n2);
    
}


public class practiceset4 {    
    public static void main(String[] args) {
       z z1=new z()
       {       
        public int sum(int n1,int n2){
            return n1+n2;
        } 
       };
       int result=z1.sum(4,5);
       System.out.println(result);
    }
       
}
