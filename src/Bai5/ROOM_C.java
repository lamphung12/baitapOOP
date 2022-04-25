package Bai5;

public class ROOM_C extends Room {
    public static String RoomC = "RoomC";
    public static int price = 300;

    public ROOM_C(String category, int price) {
        super(category, price);
    }

    public ROOM_C() {
    }

    @Override
    public String toString() {
        return "ROOM_C : " + RoomC+ " , " + price ;
    }
}
