package Strings;

public class CompareStrings {

    public static boolean checkString(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(checkString(s1, s2));

    }

}
