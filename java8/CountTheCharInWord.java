package java8;

import java.util.ArrayList;

public class CountTheCharInWord {
    public static void main(String[] args) {
        countTHeCharInEachWord("the quick brown fox");
    }

    private static void countTHeCharInEachWord(String str) {
    String[] word=str.split(" ");

    for (String s :word){
        System.out.println(s.length());
    }

    }
}
