package Aula05;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;
        DateYMD data = null;
        int dia;
        int mes;
        int ano;

        do{
            System.out.println();
            System.out.println("1 - Criar nova Date");
            System.out.println("2 - Mostrar data atual");
            System.out.println("3 - Incrementar data");
            System.out.println("4 - Decrementar data");
            System.out.println("0 - Sair");
            opt=sc.nextInt();

            switch (opt) {
                case 0:
                    System.out.println("Exit.....");
                    break;
                case 1: 
                    System.out.println("insira um dia: ");
                    dia = sc.nextInt();
                    System.out.println("insira um mes:  ");
                    mes = sc.nextInt();
                    System.out.println("insira um ano: ");
                    ano = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Date: "+ data);
                        break;
                case 3:
                    data.increment();
                    break;
                case 4:
                    data.decrement();
                        break;     
                default:
                    System.out.println("insira uma data valida!");
                    break;
            }                
               
        } while(opt!=0);
        


        

        sc.close();
        
    }
    
}
