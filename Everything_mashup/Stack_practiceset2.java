import java.util.*;

public class Stack_practiceset2 {
    public static void main(String[] args) {
       Stack<Integer> st=new Stack<>();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       st.push(5);
       System.out.println(st);
       // reverese the stack....

       Stack<Integer> rt=new Stack<>();
       while(st.size()>0){
        int x=st.peek();
        rt.push(x);
        st.pop();// element ko hatane k kaam aata h 
       }
       System.out.println(rt);

       Stack<Integer> gt=new Stack<>();
       while(rt.size()>0){
        int y=rt.peek();
        gt.push(y);
        rt.pop();

       }

       System.out.println(gt);


    }
}
