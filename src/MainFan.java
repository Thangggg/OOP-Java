public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(1, true, 10, "blue"  );
        Fan fan2 = new Fan(3, false, 5, "red"  );

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
