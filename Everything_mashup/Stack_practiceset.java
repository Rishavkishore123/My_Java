import java.util.*;
//import java.util.Stack;
public class Stack_practiceset {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(54);

        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size of stack is: "+st.size());
    }
}
