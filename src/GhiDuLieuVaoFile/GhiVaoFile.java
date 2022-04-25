package GhiDuLieuVaoFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class GhiVaoFile {
    public static void main(String[] args) {
     Student st =new Student("lam",20,5.4);
        Student st1 =new Student("lam1",21,5.4);
        Student st3 =new Student("lam2",22,5.4);
        Student st4 =new Student("lam2",23,5.4);
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(st);
        arrayList.add(st1); arrayList.add(st3);
        arrayList.add(st4);
        try {
            FileWriter fileWriter= new FileWriter("/Users/macpro/IdeaProjects/OOP/src/GhiDuLieuVaoFile/data");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Student sst:arrayList) {
                fileWriter.write(sst.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
