import java.util.Scanner;

public class MainQuad {
    public static void main(String[] args) {
        double a,b,c;
        System.out.println("Nhập vào a , b , c : ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a ,b ,c);

        if (quadraticEquation.getDiscriminant() < 0){
            System.out.println("Phương trình vô nghiệm");
        }else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("Phương trình có nghiệm kép: x =  " + quadraticEquation.getRoot1());
        }else {
            System.out.println("Phương trình có hai nghiệm : ");
            System.out.println("x1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = " + quadraticEquation.getRoot2());
        }
    }
}
