class Solution {
  public boolean isPalindrome(String s) {

        s = s.replaceAll(
                "[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        StringBuilder builder = new StringBuilder();
        builder.append(s);
        System.out.println(s);
        String reverse = builder.reverse().toString();
        System.out.println(reverse);
        return reverse.equals(s);

    }
}