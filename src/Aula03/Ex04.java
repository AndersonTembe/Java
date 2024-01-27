package Aula03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaP;
        double notaT;
        double notaF;

        do {
            System.out.print("componete pratica: ");
            notaP = sc.nextDouble();

            
        } while (notaP < 0 || notaP > 20);


        do {
            System.out.print("componete Teorica: ");
            notaT = sc.nextDouble();


        notaF = (notaP +notaT)/2;

            
        } while (notaT < 0 || notaP > 20);

        if(notaP < 7.0 || notaT < 7.0){
            System.out.println("Reprovado por nota minima");
            System.out.println("nota final: 66");
        }else if (notaF < 9.5) {
            System.out.println("Reprovado");
            System.out.println("Nota Final: " + notaF);
            
        } else {
            System.out.println("Aprovado");
            System.out.println("nota final: " + notaF);
            
        }

        System.out.print("numero de alunos: ");
        int num_alunos = sc.nextInt();

        double [][] pautas = new double [num_alunos][3];
        for(double[] n: pautas){
            n[0] = randomNota();
            n[1] = randomNota();

            if(n[0] < 7 || n[1] < 7){
                n[2] = 66;

            }else{
                n[2] = (n[0]+ n[1])/2;
            }
            System.out.printf("%10.1f %10.1f %10.1f\n", n[0],n[1],n[2]);
        }



        sc.close();
    }

    private static double randomNota() {
        double random, numero;

        random = (Math.random()*21);
        numero = (double)(Math.round(random*10))/10;
        return numero;
    }
    
}
