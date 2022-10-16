class Solution {
     public boolean isIsomorphic(String s, String t) {
       HashMap<Character, Character> sHashMap = new HashMap<>();
       HashMap<Character, Character> tHashMap = new HashMap<>();
       if (s.length() != t.length()) {
           return false;
       }
       for (int i = 0; i < s.length(); i++) {
           char sChar = s.charAt(i);
           char tChar = t.charAt(i);
           if (!sHashMap.containsKey(sChar)) {
               sHashMap.put(sChar, tChar);
           }
           if (!tHashMap.containsKey(t.charAt(i))) {
               tHashMap.put(tChar, sChar);
           }

           if (sHashMap.get(sChar) != tChar || tHashMap.get(tChar) != sChar){
               return false;
           }
       }
       return true;
    }
}