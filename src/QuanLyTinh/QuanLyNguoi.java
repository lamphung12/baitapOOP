package QuanLyTinh;

import java.util.ArrayList;

public class QuanLyNguoi implements QuanLy<Nguoi> {
    private ArrayList<Nguoi> nguoiArrayList = new ArrayList<>();

    public QuanLyNguoi() {
    }

    @Override
    public void add(Nguoi nguoi) {
      nguoiArrayList.add(nguoi);
    }

    @Override
    public void display() {

    }
}
