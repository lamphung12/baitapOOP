package Bai2;

public class Bao extends TaiLieu{
    private int ngayPhatHanh;

    public Bao( String tenNXB, int soBanPhatHanh, int ngayPhatHanh) {
        super( tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public Bao(){}

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" + super.toString()+
                "ngayPhatHanh=" + ngayPhatHanh +
                '}';
    }
}
