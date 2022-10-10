class Solution {
       public boolean isAnagram(String s, String t) {
        s = sortString(s);
        t = sortString(t);
        return s.equals(t);
    }
    
    public String sortString(String s) {
        char temp[] = s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}