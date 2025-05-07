package String;

public class Palindrome {
    public static boolean Print(String Name) {
        for (int i = 0; i <= Name.length()-1; i++) {
          int n=Name.length();
                if (Name.charAt(i) != Name.charAt(n-i-1)) {
                    return false;
                }
            }
            
        
        return true;
    }

    public static void main(String[] args) {
        String Name = "noone";
        System.out.println(Print(Name));
    }
}
