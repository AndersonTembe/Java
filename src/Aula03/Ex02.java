package Aula03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mi;
        double taxa;

        do {
            System.out.print("Montante investido (positivo e multiplo de 1000): ");
            mi = sc.nextDouble();
            
        } while (mi <= 0 || mi % 100 != 0 );

        do {
            System.out.print("taxa de juro mensal (entre 0% e 5%): ");
            taxa = sc.nextDouble();
            
        } while (taxa < 0.0 || taxa <5.0);


        // calcular 12 meses
        for(int i = 1; i <= 12; i++){
            mi += mi*(taxa/100);
            System.out.printf("Ao fim do %d mes, o seu montante atual sera de: %.2f euros.\n",i, mi);
        }



        sc.close();
    }
    
}
