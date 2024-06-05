class Room{
    int room_No;
    String roomtype;
    int roomarea;
    String ACmachine;

        public void setData(int room_No, String roomtype, int roomarea, String ACmachine){
            this.room_No=room_No;
            this.roomtype=roomtype;
            this.roomarea=roomarea;
            this.ACmachine=ACmachine;
        }

        public void displayData(){
            System.out.println("The room number is "+room_No);
            System.out.println("The room type is "+roomtype);
            System.out.println("The room area is "+roomarea);
            System.out.println("The AC machine is "+ACmachine);
        }

}

public class Create_Room{
    public static void main(String[] args){
        Room room1= new Room();
        Room room2= new Room();
        room1.setData(21,"Single",233,"Whirpool");
        room1.displayData();
        room2.setData(23,"Double-bed",500,"Samsung");
        room2.displayData();

    }
}

