class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> m  = new HashMap<>();
        //insert into hashmap and increase count for repeating key
        for(Character c : magazine.toCharArray()){
            m.put(c, m.getOrDefault(c, 0) +1);
        }

        for(Character c : ransomNote.toCharArray()){
            //insert note key and if found reduce count
            m.put(c, m.getOrDefault(c, 0) - 1);
            
            // count mismatch then it's possible to prepare note
            if(m.get(c) <0){
                return false;
            }
        }
        return true;
    }
}