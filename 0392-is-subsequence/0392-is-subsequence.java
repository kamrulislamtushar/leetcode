class Solution {
 public boolean isSubsequence(String s, String t) {
        int start = - 1;
        for (int i = 0; i < s.length(); i++) {
            int index = t.indexOf(s.charAt(i), start + 1);
            if (index == -1) {
                return false;
            }
            else {
                start = index;
            }
        }
        return true;
    }
}