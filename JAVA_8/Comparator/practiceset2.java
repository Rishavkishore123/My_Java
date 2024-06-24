package JAVA_8.Comparator;

import java.util.*;
public class practiceset2 {
    public static void main(String[] args) {
        Set<Integer> set= new TreeSet<>();
        set.add(23);
        set.add(44);
        set.add(20);
        set.add(12);

        System.out.println("Before Sorting Manually "+set);

        Set<Integer> set1= new TreeSet<>((a,b)->b-a);
        set1.add(23);
        set1.add(44);
        set1.add(20);
        set1.add(12);

        System.out.println("After Sorting in a desc through lamda expression: "+set1);
            
        
    }
}
