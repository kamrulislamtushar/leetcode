class Solution {
       public int majorityElement(int[] nums) {
        int arraySize = nums.length;
        int highestElement = -1;
        int totalCount = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int index = 0; index < arraySize; index++) {
            hashMap.put(nums[index], hashMap.getOrDefault(nums[index], 0) + 1);
            if (hashMap.get(nums[index]) > totalCount) {
                totalCount = hashMap.get(nums[index]);
                highestElement = nums[index];
            }
        }
        return highestElement;
    }
}