package Bai5;

public class ROOM_A extends Room{
  public static String Room = "RoomA";
  public static int price = 500;


  public ROOM_A() {
  }

  public ROOM_A(String category, int price) {
    super(category, price);
  }

  @Override
    public String toString() {
        return "ROOM_A : " + Room + " , " + price;
    }
}
