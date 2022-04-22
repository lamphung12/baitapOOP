package QuanLyTinh;

import java.util.ArrayList;

public class QuanLyTinh implements QuanLy<Tinh> {
    private ArrayList<Tinh> arrayList = new ArrayList<>();

    public ArrayList<Tinh> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Tinh> arrayList) {
        this.arrayList = arrayList;
    }

    public QuanLyTinh() {
        arrayList.add(new Tinh(100,"Vinh Phuc",1000,200));
        arrayList.add(new Tinh(101,"Ha Nam",500,400));
        arrayList.add(new Tinh(102,"Phu Tho",700,250));
        arrayList.add(new Tinh(103,"Cao Bang",600,200));
        arrayList.add(new Tinh(104,"Lang Son",450,350));
    }

    @Override
    public void add(Tinh tinh) {

    }

    @Override
    public void display() {
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
    }
    public void timTinh(String name ){
        for (int i = 0; i <arrayList.size() ; i++) {
            if(  arrayList.get(i).getName().equals(name)){
                System.out.println(arrayList.get(i));
            }else{
                System.out.println("Ko co trong danh sach");
            }
        }
    }


}
