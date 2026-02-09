package StripComments;

public class Main {

    public static void main(String... args){

        String res = Strip.testTwo("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" });

        System.out.println(res);




    }
}
