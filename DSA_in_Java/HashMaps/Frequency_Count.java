package HashMaps;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Frequency_Count {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the string word");
//        String word = sc.nextLine();

        System.out.println("Enter the string sentence") ;
        String sentence = sc.nextLine();

//        characterFrequency(word);
        wordFrequency(sentence);

    }

    static void characterFrequency(String word){

        Map<Character , Integer> freqMap = new HashMap<>();

        for(char c : word.toCharArray()){
            freqMap.put(c , freqMap.getOrDefault(c , 0) + 1);
        }

        for(Map.Entry<Character , Integer> result : freqMap.entrySet()){
            System.out.println(result.getKey() + " -> " + result.getValue());
        }
    }
    static void wordFrequency(String sentence){

        Map<String , Integer> freqMap = new HashMap<>();

        String[] words = sentence.split("\\s+");

        for (String word : words){
            freqMap.put(word , freqMap.getOrDefault(word , 0) + 1);
        }

        for(Map.Entry<String , Integer> result : freqMap.entrySet()){
            System.out.println(result.getKey() + " -> " + result.getValue());
        }
    }
}
