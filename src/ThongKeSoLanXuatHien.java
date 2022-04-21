
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

    public class ThongKeSoLanXuatHien {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap chuoi can kiem tra: ");
            String str = sc.nextLine();

            String [] arr = str.split(" ");
            Map<String, Integer> map = new TreeMap<>();

            for (String i: arr) {
                boolean flag = false;
                if (!i.equals("")) {
                    for (String key: map.keySet()) {
                        if (i.equals(key)) {
                            flag = true;
                            map.replace(key, map.get(key) + 1);
                            break;
                        }
                    }
                    if (!flag) {
                        map.put(i,1);
                    }

                }
            }
            for (String i : map.keySet()){
                System.out.println("số lần xuất hiện của " + i + " la:  " + map.get(i));
            }

        }
    }

