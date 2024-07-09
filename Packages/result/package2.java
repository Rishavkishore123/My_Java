package result;

class Area implements Triangle{
    public int triangle(int base ,int height){
        int area= (base*height)/2;
        return area;
    }
}

public class package2 {
    public static void main(String[] args) {
        Area a1= new Area();
        System.out.println(a1.triangle(9, 2));
    }
}
