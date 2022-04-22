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
        for (int i = 0; i < nguoiArrayList.size() ; i++) {
            System.out.println(nguoiArrayList.get(i));
        }
    }
    public void timSoNguoiTrongTinh(String name){
        for (int i=0; i<nguoiArrayList.size();i++) {
            if (nguoiArrayList.get(i).getName().equals(name)){
                System.out.println( nguoiArrayList.get(i));
            }
        }


        }

}
