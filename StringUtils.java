public class StringUtils {
    public static boolean isPalindrome(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int j = s1.length() - 1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(j)) return false;
            j--;
        }
        return true;
    }

    /*
     * Insert, remove or replace a character
     */
    public static boolean isOneAway(String s1, String s2) {
        return true;
    }
}
