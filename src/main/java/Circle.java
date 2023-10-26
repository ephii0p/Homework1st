import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите длину радиуса");
        int x = s.nextInt();
        double pi = Math.PI;
        double result = (double) ((x*x)*pi);
        System.out.println("Площадь круга ="+ result);
}}
