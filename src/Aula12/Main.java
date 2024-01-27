package Aula12;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\Aula12\\Arquivo.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.next());
                }
                sc.close();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    
    }
    
}
