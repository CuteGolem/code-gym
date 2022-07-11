package Strings;

public class PalindromeString {

    public static void checkPalindrome(String str){

        String temp = "";
        str = str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--){
            temp = temp+str.charAt(i);
        }
        if(temp.equals(str))
            System.out.println("The given String is Palindrome");
        else
            System.out.println("The given String is Not a Palindrome");

    }

    public static void main(String[] args){

        checkPalindrome("Haah");

    }

}
