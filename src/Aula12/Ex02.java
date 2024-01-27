package Aula12;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex02 {
    public static void main(String[] args) {
        File file = new File("src\\Aula12\\Arquivo.txt");
        Map<Character, Map<String, Integer>> palavras = new TreeMap<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String palavra = sc.nextLine().toLowerCase();
                if (palavra.length() >= 3) {
                    char primeiraLetra = palavra.charAt(0);
                    Map<String,Integer> world = palavras.getOrDefault(primeiraLetra, new HashMap<>());
                    world.put(palavra, world.getOrDefault(palavra, 0) + 1);
                    palavras.put(primeiraLetra, world);

                }
                
            }
            sc.close();
            
        } catch (Exception e) {
            System.out.println("Erro ao abrir o ficheiro!");
            return;
        
        }
       
        

    
        
        
    }
    
}
