package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a:");
        int a = scanner.nextInt();
        System.out.println("Nhập vào cạnh b:");
        int b = scanner.nextInt();
        System.out.println("Nhập vào cạnh c:");
        int c = scanner.nextInt();

        try {
            Triangle triangle = new Triangle(a, b, c);
            System.out.println("Là tam giác");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }


    }
}
