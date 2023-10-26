import java.awt.*;
import java.util.Scanner;

public class PerQutro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите длину стороны");
        int x = s.nextInt();
        int result = x*x;
        System.out.println("Площадь квадрата ="+ result);
    }
}
