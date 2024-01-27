package Aula02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km,m;
        System.out.print("Distancia em quilometoros: ");
        km = sc.nextDouble();
        m = km/1.609;
        System.out.print("A conversao e a seguinte: "+ m);

        sc.close();
        
    }
    
}
