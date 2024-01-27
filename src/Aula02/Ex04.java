package Aula02;

import java.util.Scanner;
import java.lang.Math;

public class Ex04 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Montante investido: ");
        double mi = sc.nextDouble();
        System.out.print("Taxa de juros mensal: ");
        double tx = sc.nextDouble();

        // calcular o valor total apos  3 meses
        
        // double valortotal = mi;
        // for(int i = 0; i < 3; i++) {
        //     valortotal += valortotal * tx;

        double valortotal = mi *Math.pow(1 + tx, 3);

        System.out.println("O valor total apos os 3 meses e: " + valortotal);
      

        sc.close();
    }
    
}

