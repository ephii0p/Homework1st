import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        System.out.println("Введите длину высоты");

        int x = s.nextInt();
        System.out.println("Введите длину основания");

        int y = h.nextInt();
        double z = 0.5;

        double result = (double) (z * x * y);
        System.out.println("Площадь треугольника =" + result);
    }
}