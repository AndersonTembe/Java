package Aula02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de agua em quilogramas: ");
        double m = sc.nextDouble();
        System.out.println("Temperatura inicial: ");
        double ti = sc.nextDouble();
        System.out.println("Temperatura Final: ");
        double tf = sc.nextDouble();

        double q = m*(tf-ti)*4184;
        System.out.println("A energia necessaria e de: " + q + "j");


        sc.close();
    }
    
}
