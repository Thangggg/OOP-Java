public class People {
    String name;
    int age;
    String gender;
    private int id;
    private static int idNumber = 1;

    public People(){};

    public People(String name, int age, String gender) {
        this.id = idNumber++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return " Tên: " + name + " - Tuổi: " + age + " - Giới tính: " + gender + " - Id: " + id;
    }
}
