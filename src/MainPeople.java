import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class MainPeople {
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. Hiển Thị Nhân Viên ");
        System.out.println("2. Thêm Nhân Viên ");
        System.out.println("3. Xóa Nhân Viên ");


        Scanner sc = new Scanner(System.in);
        String [] array = new String[100];

        People people1 = new People("Ronaldo", 36, "Male");
        People people2 = new People("Bật Mã Ôn", 5000, "Male");
        People people3 = new People("Taylor Swift", 33, "Female");


        int number = sc.nextInt();

        switch (number){
            case 1:
                System.out.println( people1.toString());
                System.out.println( people2.toString());
                System.out.println( people3.toString());
            case 2:
                for (int i = 0; i <array.length; i++) {
                    array[i] = people1.toString();
                }
            case 3:

        }
    }
}
