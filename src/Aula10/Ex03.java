package Aula10;

import java.util.HashMap;

public class Ex03 {
    public static void main(String[] args) {
        String str = "Hello world";
        HashMap<Character, String> charpositions = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charpositions.containsKey(c)) {
                String positions = charpositions.get(c);
                positions += ", " + i;
                charpositions.put(c, positions);
            } else {
                charpositions.put(c, "[" + i + "]");
            }
        }

        System.out.println(charpositions);
    }
    
}
