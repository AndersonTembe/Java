package Aula05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;
        Calendario data = null;
        int ano;
        int mes;
        int dSemana;
        do {
            System.out.println();
            System.out.println("1 - Criar novo calendario");
            System.out.println("2 - Imprimir um mês do calendário");
            System.out.println("3 - Imprimir calendário");
            System.out.println("0 - Sair");
            System.out.println();
            opt=sc.nextInt();

            switch (opt) {
                case 0:
                    System.out.println("Exit....");  
                    break;
                case 1:
                    System.out.println("insira um ano: ");
                    ano = sc.nextInt();
                    System.out.println("insira o primeiro dia da semana do mes: ");
                    System.out.printf(" %9s | %9s | %9s | %9s | %9s | %9s | %9s \n","1=Domingo","2=Segunda","3=Terça","4=Quarta","5=Quinta","6=Sexta","7=Sábado");
                    dSemana = sc.nextInt();
                    if(dSemana >= 1 && dSemana <= 7){
                        data = new Calendario(ano, dSemana);
                    }else{
                        System.out.println("insira um dia da sdemana valido!");
                    }
                    break;
                case 2:
                    System.out.println("insira um mes: ");
                    mes = sc.nextInt();
                    if(DateYMD.ValidMonth(mes)){
                        data.printMonth(mes);
                    }else{
                        System.out.println("insira um mes valido!");
                    }
                    break;
                case 3:
                    data.printCalendario();
                    break;
            
                default:
                    System.out.println("Escolha uma opçao valida!");
                    break;
            }

            
        } while (opt !=0);

       
        sc.close();
        
    }
    
}
