import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static boolean areAnagram(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2) {
            return false;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkPangram(String s) {
        if (s == null) return false;
        String lowerStr = s.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (lowerStr.indexOf(ch) < 0) {
                return false;
            }
        }
        return true;
        }
    }
