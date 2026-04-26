import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // String a = sc.nextLine();
        String a="HiMyNameIsPartha";
        String word = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (Character.isUpperCase(c) && word.length() > 0) {
                System.out.println(word);
                word = "";
            }

            word += c;
        }

        System.out.println(word);
    }
}