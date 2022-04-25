package Bai5;

public class Person {
    private String name;
    private int age;
    private int id;
    public static int autoId=0;
    private Room room;
    private int soNgayThue;

    public Person(String name, int age, Room room, int soNgayThue) {
        this.name = name;
        this.age = age;
        this.id = autoId;
        autoId++;
        this.room = room;
        this.soNgayThue = soNgayThue;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public String toString() {
        return "Person : "+ id + " , " + name + " ," + age + "," +
             room + " , " + soNgayThue ;
    }
}
