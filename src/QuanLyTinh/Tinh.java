package QuanLyTinh;

public class Tinh {
    private int maTinh;
    private String name;
    private int danSo;
    private double GDP;

    public Tinh(int maTinh, String name, int danSo, double GDP) {
        this.maTinh = maTinh;
        this.name = name;
        this.danSo = danSo;
        this.GDP = GDP;
    }

    public Tinh() {
    }

    public int getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(int maTinh) {
        this.maTinh = maTinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public double getGDP() {
        return GDP;
    }

    public void setGDP(double GDP) {
        this.GDP = GDP;
    }

    @Override
    public String toString() {
        return 
                 + maTinh + " , " +
                 name + " , " +
                 danSo + " , "+
                GDP ;

    }
}
