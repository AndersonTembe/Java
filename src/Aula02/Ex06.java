package Aula02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Segundos: ");
        int seg = sc.nextInt();
        double h = seg/3600;
        double m = seg/60-h*60;
        double s = seg%3600-3*60;
        System.out.printf("%02d:%02d:%02d:",h,m,s);

        sc.close();

        
    }
    
}
