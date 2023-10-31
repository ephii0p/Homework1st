import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Напишите какая у вас фигура?");
        String[] strings = new String[4];
        strings[0] = "";
        strings[1] = "1.круг";
        strings[2] = "2.треугольник";
        strings[3] = "3.квадрат";
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        Scanner j = new Scanner(System.in);
        int p = j.nextInt();
        if (p == 3) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите длину стороны");
            double x = s.nextDouble();

            double result = x * x;
            System.out.println("Площадь квадрата =" + result);
        } else if (p == 1) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите длину радиуса");
            double x = s.nextDouble();
            double pi = Math.PI;

            double result = (double) ((x * x) * pi);
            System.out.println("Площадь круга =" + result);
        } else if (p == 2) {
            Scanner s = new Scanner(System.in);
            Scanner h = new Scanner(System.in);
            System.out.println("Введите длину высоты");
            double x = s.nextDouble();

            System.out.println("Введите длину основания");
            double y = h.nextDouble();
            double z = 0.5;

            double result = (double) (z * x * y);
            System.out.println("Площадь треугольника =" + result);
        }
    }
}
