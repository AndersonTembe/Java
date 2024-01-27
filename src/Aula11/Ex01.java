package Aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        File file = new File("major.txt");
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[\n.,:'‘’;?!-*{}=+&/()\\[\\]”“\"\\s]+");
            HashMap<String, HashMap<String, Integer>> wordPairs = new HashMap<String, HashMap<String, Integer>>();
            
            String prevWord = null;
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > 2) {
                    if (prevWord != null) {
                        if (!wordPairs.containsKey(prevWord)) {
                            wordPairs.put(prevWord, new HashMap<String, Integer>());
                        }
                        HashMap<String, Integer> counts = wordPairs.get(prevWord);
                        if (!counts.containsKey(word)) {
                            counts.put(word, 0);
                        }
                        counts.put(word, counts.get(word) + 1);
                    }
                    prevWord = word;
                } else {
                    prevWord = null;
                }
            }
            
            for (String word1 : wordPairs.keySet()) {
                HashMap<String, Integer> counts = wordPairs.get(word1);
                for (String word2 : counts.keySet()) {
                    System.out.println(word1 + "={" + word2 + "=" + counts.get(word2) + "}");
                }
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
        
   

       
    }

    
