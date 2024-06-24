package JAVA_8.Comparator;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class practiceset1 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList <> ();
        list.add(2);
        list.add(4);
        list.add(0);
        list.add(5);
        list.add(9);

        Collections.sort(list, (a,b)->b-a);
        System.out.println(list);

    }
    
}

