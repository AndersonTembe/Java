package Aula02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double n = sc.nextDouble();
        double max = n;
        double min = n;
        double total = 0;
        double numval = 0;


        while (true) {
            System.out.print("Digite um numero: ");
            double num = sc.nextDouble();
            if (num == n) break;
            if(num >  max) max = num;
            if(num < min) min = num;
            total += n;
            numval ++;
                
            
        }
        double a = total/numval;
        System.out.println("Max:"  + max);
        System.out.println("min:" + min);
        System.out.println("numeros: " + numval);
        System.out.println("valor: " + a);

        sc.close();


   

         

        
    }
    
}
