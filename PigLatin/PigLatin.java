package PigLatin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {

    public static String pigIt(String str) {
        String[] words = str.split(" ");
        for(int i = 0; i < words.length;i++){
            String w = words[i];
            if (w.matches("\\p{Punct}")) continue;

            words[i] = w.substring(1) + w.charAt(0) + "ay";
        }

        return String.join(" ", words);
    }
    public static String pigIt2(String str) {
        return Arrays.stream(str.split(" "))
                .map(w -> w.matches("\\p{Punct}") ? w : w.substring(1) + w.charAt(0) + "ay")
                .collect(Collectors.joining(" "));


    }
    public static String pigIt3(String str){
        return str.replaceAll("\\b(\\p{L})(\\p{L}*)\\b", "$2$1ay");

    }

}
