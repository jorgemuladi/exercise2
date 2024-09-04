package org.example.Day3;

public class CountVowel {
    public static int countVowel(String str) {

        int count = 0;
        String vowel = "aeiouAEIOU";

        for (int i=0; i<str.length(); i++) {
            if(vowel.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }


}
