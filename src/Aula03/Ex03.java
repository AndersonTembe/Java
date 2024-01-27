package Aula03;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random random = new Random();
        boolean jogar = true;
        int tentativas = 0;
        
        while (jogar) {
            int num = random.nextInt(100) + 1; // Gera um número entre 1 e 100
            int tentativa = 0;
            
            System.out.print("Tente adivinhar o número (entre 1 e 100):");
            
            while (tentativa != num) {
                tentativa = sc.nextInt();
                
                if (tentativa < num) {
                    System.out.println("Muito baixo.");
                } else if (tentativa > num) {
                    System.out.println("Muito alto.");
                }
                
                tentativas++;
            }
            
            System.out.println("você acertou o número em " + tentativas + " tentativas.");
            System.out.println("Pretende continuar? Prima (S)im.");
            
            String resposta = sc.next();
            jogar = resposta.equals("sim") || resposta.equals("Ss");
            
            tentativas = 0;
        }
      
      sc.close();
        
    }
    
}
