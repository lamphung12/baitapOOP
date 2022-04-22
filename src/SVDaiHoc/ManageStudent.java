package SVDaiHoc;

import java.util.ArrayList;

public class ManageStudent {
  ArrayList<Students> studentsArrayList = new ArrayList<>();

  public void add(Students students1){
      studentsArrayList.add(students1);
  }
  public void display(){
    for (int i = 0; i < studentsArrayList.size() ; i++) {
        System.out.println(studentsArrayList.get(i));
    }
  }
  public void findById(int id){
    for (int i = 0; i < studentsArrayList.size() ; i++) {
        if(studentsArrayList.get(i).getId() == id){
            System.out.println(studentsArrayList.get(i));
        }
    }
  }

  public void exit(){
      System.exit(0);
  }






}
