package Stack;

import java.util.*;
public class Valid_parnthesis {
   
    public static boolean isvalidPare(String str){
        Stack <Character>sta= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='(' || ch== '[' || ch== '{') sta.push(ch);
            else{
                if(sta.isEmpty()) return false;

                char top=sta.pop();
                if(ch == ')' && top!='(' || ch== ']' && top!= '[' || ch== '}' && top!= '{') return false;

            }

            
        }

        return (sta.isEmpty());
         

          
    }
    public static void main(String[] args) {

        System.out.println("Enter the string:");
        Scanner sc= new Scanner(System.in);

        String str=sc.nextLine();

        System.out.println(isvalidPare(str));
    }
}
