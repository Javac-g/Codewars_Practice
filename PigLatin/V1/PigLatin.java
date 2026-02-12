package PigLatin.V1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {

    public static String process(String str){
        return Arrays.stream(str.split(" "))
                .map(w -> w.matches("\\p{Punct}" ) ? w : w.substring(1) + w.charAt(0) + "AY")
                .collect(Collectors.joining(" "));
    }

    public static void main(String... args){
        System.out.println(process("Pig latin is cool"));


    }
}
