class Solution {
    public int missingNumber(int[] nums) {
        int highestValue = nums.length ;
        int expectedSum = (highestValue * (highestValue + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum = actualSum + nums[i];
        }
        return  expectedSum - actualSum;
    }
}