class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        int maxNum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if ((i != maxIndex) && (maxNum < nums[i] * 2)) {
                return -1;
            }
        }

        return maxIndex;
    }
}