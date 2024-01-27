package Aula02;

import java.util.Scanner;
import java.lang.Math;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Catetos A: ");
        double a = sc.nextDouble();
        System.out.print("Catetos B: ");
        double b = sc.nextDouble();

        // calcular a hipotenusa
        double c = Math.hypot(a, b);

        // calcular o angulo (em graus) entre lado A e a hipotenosa
        double ang = Math.toDegrees(Math.atan2(a, c));

        System.out.println("Hipotenusa: " + c);
        System.out.println("Angulo: " + ang);


        sc.close();
    }
    
}
