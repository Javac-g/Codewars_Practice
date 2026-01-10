package PigLatin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigTestTwo {
    public static String latin(String str){

        return Arrays.stream(str.split(" "))
                .map(word -> word.matches("\\p{Punct}") ? word : word.substring(1) + word.charAt(0) + "ay")
                .collect(Collectors.joining(" "));
    }
}
