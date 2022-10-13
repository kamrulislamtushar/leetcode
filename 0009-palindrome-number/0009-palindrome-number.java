class Solution {
     public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        String reverse = builder.reverse().toString();
        return reverse.equals(String.valueOf(x));
    }
}