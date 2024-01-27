package Aula01;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) {
        Path fich = Paths.get("major.txt");
        try {
            Files.readAllLines(fich).stream().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("certifique-se que o ficheiro esta\"major.txt\"esta na raiz da pasta do projeto ");
        }  
        
    }
    
}
