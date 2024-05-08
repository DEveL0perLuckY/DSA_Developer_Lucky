class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // Calculate the sum of pairs from nums1 and nums2 and store in the map
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                int sum = num1 + num2;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        // Check the sum of pairs from nums3 and nums4
        for (int num3 : nums3) {
            for (int num4 : nums4) {
                int sum = num3 + num4;
                // If the negative of this sum exists in the map, add its count to the result
                if (map.containsKey(-sum)) {
                    count += map.get(-sum);
                }
            }
        }

        return count;
    }
}