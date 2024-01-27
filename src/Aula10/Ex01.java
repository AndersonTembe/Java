package Aula10;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {
        Map<String, Book> BookGenero = new HashMap<>();

        // Adicionar livros aos generos

        BookGenero.put("Drama", new Book("Romeu e julieta", "Wiliam Shake", 1968));
        BookGenero.put("Romance", new Book("A viagem do tempo", "Diana Gabaldon", 1945));
        BookGenero.put("Aventura", new Book("Uma Aventura", "Ana Maria Magalhaes", 2010));
        BookGenero.put("Terror", new Book("it", "Stephen King", 2018));
        BookGenero.put("ficçao cientifica ", new Book("Duna"," Frank Herbet", 1965));


        System.out.println(BookGenero.entrySet());
        System.out.println(BookGenero.keySet());
        System.out.println(BookGenero.values());

        
    }

    

    
    
}
