package Aula02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tempertura em graus cº: ");
        double c = sc.nextDouble();
        double f = 1.8*c+32;
        System.out.println(c + "graus cº = "+ f + "graus Fº");
        sc.close();
    }
    
}
