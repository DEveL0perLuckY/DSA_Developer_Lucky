class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.put(num, result.getOrDefault(num, 0) + 1);
                map.put(num, map.get(num) - 1);
            }
        }
        
        int size = 0;
        for (int value : result.values()) {
            size += value;
        }
        int[] intersection = new int[size];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                intersection[index++] = num;
            }
        }
        
        return intersection;
    }
}