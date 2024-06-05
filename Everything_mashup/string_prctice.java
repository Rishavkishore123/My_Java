public class string_prctice {

    static int findString(String str,char target){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target) return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        String name="Rishav";
        char target='h';
        
        System.out.print(findString(name,target));
    }
}
