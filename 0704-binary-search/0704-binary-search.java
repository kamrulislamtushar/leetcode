class Solution {
    public int search(int[] nums, int target) {
        // nums = new int[] {2,5};
        // target = 5;
        int lastIndex = nums.length - 1;
        if (lastIndex == 0 && nums[lastIndex] == target ) {
            return 0;
        }
        int result = binarySearch(nums, 0, lastIndex, target);
        return result;
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        if (start <= end) {
            int mid = ( start + end ) / 2;
            if ( nums[mid] == target ) {
                return  mid;
            }
            if (nums[mid] < target) {
                return binarySearch(nums, mid + 1, end, target);
            } else {
                return binarySearch(nums, start, mid -1, target);
            }
        }
        return  - 1;
    }
}