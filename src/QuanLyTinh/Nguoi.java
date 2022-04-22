package QuanLyTinh;

public class Nguoi extends Tinh {
    private int ma;
    private String name;
    private int age;

    public Nguoi() {
    }

    public Nguoi(int maTinh, String name, int danSo, double GDP, int ma, String name1, int age) {
        super(maTinh, name, danSo, GDP);
        this.ma = ma;
        this.name = name1;
        this.age = age;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nguoi{" + super.toString()+
                "ma=" + ma +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
