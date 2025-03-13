package String;

public class Practice {
    public static String Test(String str) {
        Integer count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        // System.out.println("No. of vowel is : " + count);
        return count.toString();
    }

    public static void main(String[] args) {
        //String str = "AEIOU";
        //System.out.println(Test(str));

        // 
        String str="ApnaCollege";
        System.out.println(str.replace("l",""));

    }
}
