package Bai3;

public class CaNhan {
    private String haVaTen;
    private int age;
    private String ngheNgiep;
    private int id;
    private static int autoID;


    public CaNhan(String haVaTen, int age, String ngheNgiep) {
        this.haVaTen = haVaTen;
        this.age = age;
        this.ngheNgiep = ngheNgiep;
        this.id = autoID;
        autoID++;
    }

    public CaNhan() {
    }

    public String getHaVaTen() {
        return haVaTen;
    }

    public void setHaVaTen(String haVaTen) {
        this.haVaTen = haVaTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNgheNgiep() {
        return ngheNgiep;
    }

    public void setNgheNgiep(String ngheNgiep) {
        this.ngheNgiep = ngheNgiep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CaNhan{" +
                "haVaTen='" + haVaTen + '\'' +
                ", age=" + age +
                ", ngheNgiep='" + ngheNgiep + '\'' +
                ", id=" + id +
                '}';
    }
}
