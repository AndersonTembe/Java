package Aula02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int n = sc.nextInt();

        for(int i = n; i >=0; i--){
            System.out.print(i);
            if (i>0){
                System.out.print(",");
            }
        }

        sc.close();
    }
    
}
