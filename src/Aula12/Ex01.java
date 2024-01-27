package Aula12;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        File file = new File("src\\Aula12\\Arquivo.txt");
        Set<String> Palavra = new HashSet<>();
        int cont = 0;

        try {
           Scanner sc = new Scanner(file);
           while (sc.hasNext()) {
            String palavra = sc.next().toLowerCase().replaceAll("[^a-z]", "");
            Palavra.add(palavra);
            cont ++;
           }
           sc.close();
            
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo");
            return;
        }
        System.out.println("Numero Total de Palavras: ");
        System.out.println(cont);
        

        System.out.println("Numero de diferentes Palavras: ");
        System.out.println(Palavra.size());
        





    }
    
}
