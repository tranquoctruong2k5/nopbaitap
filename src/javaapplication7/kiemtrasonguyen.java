package javaapplication7;

import java.util.Scanner;

public class kiemtrasonguyen {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("mời nhập số: ");
        boolean a = kb.hasNextInt();
        System.out.println("có phải số nguyên không: " + a); 
    }
}
