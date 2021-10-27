package numberFormatException;

import java.util.Scanner;

public class CalculationExample {
    private void calculate(double x, double y) {
        try {
            System.out.println("Tổng x + y = " + (x + y));
            System.out.println("Hiệu x - y = " + (x - y));
            System.out.println("Tích x * y = " + (x * y));
            System.out.println("Thương x / y = " + (x / y));
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }
}
