package SVDaiHoc;

public class StudentsKhoiA extends Students{
    public static String MON_TOAN = "Toan";
    public static String MON_LY = "Ly";
    public static String MON_HOA = "Hoa";

    public StudentsKhoiA(){}
    public StudentsKhoiA( String name, String address, int priority) {
        super( name, address, priority);
    }

    @Override
    public String toString() {
        return "SinhVienKhoiA{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + MON_TOAN + " - " + MON_LY + " - " + MON_HOA +
                '}';
    }
}
