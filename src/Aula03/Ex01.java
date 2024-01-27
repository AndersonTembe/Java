package Aula03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um numero positivo: ");
        num = sc.nextInt();

    while (num <= 0) {
        System.out.println("O numero deve ser positivo");
        System.out.print("Digite um numero positivo: ");
        num = sc.nextInt();

        
    }
    // calcular a soma dos numeros
    int soma = 0;
    for(int i = 0; i < num; i++){
        if(isprime(i)){
            soma +=i;

        }
    }
    System.out.println("A soma dos numeros: " + num + " e: " +soma);

    
        sc.close();
    }
     // funcao do numero primo

    private static boolean isprime(int number) {
        if(number <= 1)
        return false;
        for(int n = 2; number<= Math.sqrt(number); n++){
            if(number % n == 0)
            return false;
        }
        return true;

       
    }
    }
    

