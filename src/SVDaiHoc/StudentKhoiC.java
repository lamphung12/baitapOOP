package SVDaiHoc;

public class StudentKhoiC extends Students{
    public  final String MON_VAN = "Van";
    public  final String MON_SU = "Su";
    public  final String MON_DIA = "Dia";
    public StudentKhoiC(){}
    public StudentKhoiC( String name, String address, int priority) {
        super( name, address, priority);
    }

    @Override
    public String toString() {
        return "SinhVienKhoiC{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + MON_VAN + " - " + MON_SU + " - " + MON_DIA+
                '}';
    }
}
