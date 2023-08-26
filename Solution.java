import java.util.ArrayList;

class Solution {
    static String longestPalin(String S) {
        int n = S.length();
        ArrayList<String> stra = new ArrayList<>();
        ArrayList<Integer> strl = new ArrayList<>();
        int i = 0;

        while (i <= n) {
            String var = S.substring(i, n);
            if (plaindrome(var)) {
                stra.add(var);
                strl.add(var.length());
            }
            i++;
        }
        int index = 0;
        for (int j = 1; j < strl.size(); j++) {
            if (strl.get(j) > strl.get(index)) {
                index = j;
            }
        }
        return stra.get(index);

    }

    static boolean plaindrome(String str) {
        boolean check = true;
        int n = str.length() - 1;
        int i = 0;
        while (i<=n) {
            if (str.charAt(i) != str.charAt(n)) {
                check = false;
                break;
            }
            i++;
            n--;
        }
        return check;
    }

    public static void main(String[] args) {
        longestPalin("aaaabbaa");
    }
}
