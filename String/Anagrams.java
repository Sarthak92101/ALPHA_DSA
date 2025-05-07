package String;

import java.util.Arrays;

public class Anagrams {
    public static void Test(String str, String str2) {
        if (str.length() != str2.length()) {
            System.out.println("Strings are not Anagrams");
            return;
        }

        str = str.toLowerCase();
        str2 = str2.toLowerCase();

        char[] strCharArray = str.toCharArray();
        char[] str2CharArray = str2.toCharArray();

        Arrays.sort(strCharArray);
        Arrays.sort(str2CharArray);
        if (Arrays.equals(strCharArray, str2CharArray)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

    }

    public static void main(String[] args) {
        String str = "rAce";
        String str2 = "care";
        Test(str, str2);
    }
}
