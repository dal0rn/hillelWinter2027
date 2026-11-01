package HW7;

public class isPalindrome {

    public static boolean IsPalindrome(String str) {
        String reversed = StringReverse.stringReverse(str);

        return str.equals(reversed);
    }
}

