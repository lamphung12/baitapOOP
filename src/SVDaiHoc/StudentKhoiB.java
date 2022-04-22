package SVDaiHoc;

public class StudentKhoiB extends Students{
    public  final String MON_TOAN = "Toan";
    public  final String MON_HOA = "Hoa";
    public  final String MON_SINH = "Sinh";
    public StudentKhoiB(){}
    public StudentKhoiB( String name, String address, int priority) {
        super( name, address, priority);
    }

    @Override
    public String toString() {
        return "SinhVienKhoiB{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + MON_TOAN + " - " + MON_HOA + " - " + MON_SINH +
                '}';
    }
}
