class Solution {
      public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int index = 0; index < nums.length; index++) {
            Integer requiredSum = target - nums[index];
            if (map.containsKey(requiredSum)) {
                int returnArray[] = {map.get(requiredSum), index};
                return  returnArray;
            }
            map.put(nums[index],index);
        }
        return null;
    }
}