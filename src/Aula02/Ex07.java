package Aula02;

import java.util.Scanner;
import java.lang.Math;


public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x1: ");
        double x1 = sc.nextDouble();
        System.out.println("y1: ");
        double y1 = sc.nextDouble();
        System.out.println("x2: ");
        double x2 = sc.nextDouble();
        System.out.println("y2: ");
        double y2 = sc.nextDouble();

        double dis = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println("Distancia: " +dis);


        sc.close();
    }
    
}
