package Palindrome;

import java.io.Console;

import static java.lang.Math.floor;

public class palindrome {
    public static void main(String[] args) {
        int val = 1221;
        System.out.println(isPalindrome(val));
    }
    public static boolean isPalindrome(int x) {

        char[] digits = String.valueOf(x).toCharArray();
        int m = digits.length;
        System.out.println(m);
        boolean j =false;

        for (int i = 0; i< (double) (m / 2); i++){
            if ((digits[i] == digits[(m - 1) - i])) {
                j = true;
            }
            else {
                j = false;
                break;
            }
        }

        return j;
    }
}
