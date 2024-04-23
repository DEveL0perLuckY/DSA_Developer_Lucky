class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();

        // [1,2,2,1]

        for (int a : nums1) {
            x.add(a);
        }

        for (int b : nums2) {
            if (x.contains(b)) {
                y.add(b);
            }
        }
        int i = 0;
        int arr[] = new int[y.size()];
        for (int c : y) {
            arr[i] = c;
            i++;
        }
        return arr;
    }
}