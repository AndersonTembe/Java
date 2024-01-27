package Aula02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidade (v1): ");
        double v1 = sc.nextDouble();
        System.out.print("Distancia (d1): ");
        double d1 = sc.nextDouble();
        System.out.print("Velocidade (v2): ");
        double v2 = sc.nextDouble();
        System.out.print("distancia (d2): ");
        double d2 = sc.nextDouble();

        double vf =(v1*v2*d1+d2)/(d1*v2+d2*v1);
        System.out.println("A velociade media Final: " + vf);
        sc.close();
    }
    
}
