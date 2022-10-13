class Solution {
 public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int inputLength = s.length();
        int result = map.get(s.charAt(inputLength - 1));
        for (int i = inputLength - 2; i >= 0 ; i --) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                result = result + map.get(s.charAt(i));
            } else {
                result = result - map.get(s.charAt(i));
            }
        }
        return result;
    }
}