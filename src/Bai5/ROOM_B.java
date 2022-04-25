package Bai5;

public class ROOM_B extends Room{
    public static String RoomB = "RoomB";
    public static int price = 300;

    public ROOM_B(String category, int price) {
        super(category, price);
    }

    public ROOM_B() {
    }

    @Override
    public String toString() {
        return "ROOM_B : " + RoomB +" , "+ price ;
    }
}
