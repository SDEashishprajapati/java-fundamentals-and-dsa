package javaBasics01;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double area = 3.14159 * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

