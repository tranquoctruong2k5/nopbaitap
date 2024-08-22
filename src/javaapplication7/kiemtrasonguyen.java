package javaapplication7;

import java.util.Scanner;

public class kiemtrasonguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("bạn nhập vào là một số nguyên: " + number);
        } else {
            System.out.println("bạn nhập vào không phải là số nguyên.");
        }
    
    }
}
