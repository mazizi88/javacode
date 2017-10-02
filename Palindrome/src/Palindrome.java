import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Please enter a string:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean isPalindrome = checkPalindrome(input);
        System.out.println("The string is palindrome: " + isPalindrome);
    }

    static boolean checkPalindrome(String input)
    {
        boolean flag;
        String reverse = "";
        int length = input.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + input.charAt(i);

        if (input.equals(reverse))
            flag = true;
        else
            flag = false;

        return flag;
    }
}
