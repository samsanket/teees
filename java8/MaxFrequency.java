package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {
    public static void main(String[] args) {
        String result = maximumFrequency("the devil in the sky");
        System.out.println("Word with maximum frequency: " + result);
    }

    public static String maximumFrequency(String s) {
        String[] words = s.split(" ");
        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }
        String maxFrequencyWord = "";
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxFrequencyWord = entry.getKey();
            }
        }
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

        return maxFrequencyWord;
    }
}