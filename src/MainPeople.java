import java.util.Scanner;

public class MainPeople {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        People[] people = new People[3];
        people[0] = new People("Toàn", 23, "nam");
        people[1] = new People("Nam", 28, "nam");
        people[2] = new People("Tùng", 30, "nam");

        while (true) {
            System.out.println("1. Hiển thị nhân viên");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Sửa nhân viên");
            System.out.println("5. Xóa Theo Tên:");
            int so = scanner.nextInt();

            switch (so) {
                case 1:
                    show(people);
                    break;
                case 2:
                    people = createNhanVien(people);
                    break;
                case 3:
                    people = delete(people);
                    break;
                case 4:
                    people = edit(people);
                case 5:
                    people = deleteName(people);

            }
        }
    }

    public static void show(People[] people) {
        for (People nv : people) {
            System.out.println(nv.toString());

        }
        System.out.println();
    }

    public static People[] createNhanVien(People[] people) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập Giới Tính:");
        String gender = scanner.nextLine();
        System.out.println("Nhập Tuổi:");
        int age = scanner.nextInt();

        People nhanVien = new People(name, age, gender);

        People[] newNV = new People[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            newNV[i] = people[i];
        }

        newNV[newNV.length - 1] = nhanVien;
        return newNV;

    }

    public static People[] edit(People[] people){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào id muốn sửa");
        int number = sc.nextInt();
        int index = 0 ;
        for (int i = 0; i < people.length; i++) {
            if (number == people[i].getId()){
                index = i;
            }
        }
        System.out.println("Nhập tên: ");
        String name = sc.next();
        System.out.println("Nhập tuổi:");
        int age = sc.nextInt();
        System.out.println("Nhập giới tính: ");
        String gender = sc.next();
        people[index].setAge(age);
        people[index].setName(name);
        people[index].setGender(gender);
        return people;
    }

    public static People[] deleteName(People[] people){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên muốn xóa: ");
        String name = sc.next();
        int index = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equals(name)){
                index = i;
            }
        }
        for(int i = index; i < people.length -1 ; i++) {
            people[i] = people[i+1];
        }

        People[] newNV = new People[people.length - 1];
        for (int i = 0; i < newNV.length ; i++) {
            newNV[i] = people[i];
        }

        return newNV;


    }

    public static People[] delete(People[] people){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào id muốn xóa: ");
        int number = sc.nextInt();


        for(int i = number - 1; i < people.length -1 ; i++) {
            people[i] = people[i+1];
        }

        People[] newNV = new People[people.length - 1];
        for(int i = 0; i < people.length -1 ; i++) {
            newNV[i] = people[i];
        }
        return newNV ;
    }
}
