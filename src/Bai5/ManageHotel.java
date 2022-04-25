package Bai5;

import java.util.ArrayList;

public class ManageHotel implements General<Person>{
 private ArrayList<Person> arrayList = new ArrayList<>();


    public ManageHotel() {
    }

    public ManageHotel(ArrayList<Person> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<Person> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Person> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void add(Person person) {
     arrayList.add(person);
    }

    @Override
    public int search(int id) {
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit(int id, Person person) {

    }

    @Override
    public void delete(int id) {
      int viTriXoa = search(id);
        for (int i = 0; i <arrayList.size() ; i++) {
            if(viTriXoa==-1){
                System.out.println("Khong co id nay");
            }else{
                arrayList.remove(viTriXoa);
            }
        }
    }
    @Override
    public void display() {
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
    }

    @Override
    public void exit() {
        System.exit(0);

    }
    public int tinhGiaTien(int id) {

        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i).getId()==id ){
                System.out.println(arrayList.get(i).getSoNgayThue() );
                System.out.println( arrayList.get(i).getRoom());
                System.out.println(arrayList.get(i).getSoNgayThue() * arrayList.get(i).getRoom().getPrice());
           return arrayList.get(i).getSoNgayThue() * arrayList.get(i).getRoom().getPrice();

            }

        }
        return 0;
    }


}
