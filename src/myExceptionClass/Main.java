package myExceptionClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int device() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        if (b == 0) {
            throw new MyException("Không chia được cho 0");
        } else if (b == 3) {
            throw new MyException("b phải khác 3");
        } else {
            return a/b;
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Thương của phép chia là: " + Main.device());
        } catch (MyException exception) {
            System.err.println(exception.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Nhập số nguyên đi b êi!!!");
        }
        System.out.println("Hahaha");
    }
}
