package Bai3;

public class hoGiaDinh extends CaNhan{
    private int soNha;

    public hoGiaDinh(String haVaTen, int age, String ngheNgiep, int soNha) {
        super(haVaTen, age, ngheNgiep);
        this.soNha = soNha;
    }

    public hoGiaDinh(int soNha) {
        this.soNha = soNha;
    }
    public hoGiaDinh(){}

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    @Override
    public String toString() {
        return "hoGiaDinh{" + super.toString()+
                "soNha=" + soNha +
                '}';
    }
}
