package JAVA_8.Lamda_Expression;


@FunctionalInterface
interface E{
    void timing(int i,int j);
}



public class practiceset2 {
    public static void main(String[] args) {
       E e1=(i,j) -> System.out.println("This is the page of showing "+i+j);
       e1.timing(5,8);
}

}
