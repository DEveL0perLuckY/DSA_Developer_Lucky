class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : stones.toCharArray()) {
            int i = map.getOrDefault(ch, 0);
            map.put(ch, i + 1);
        }
        int i = 0;
        for (char ar : jewels.toCharArray()) {
            if (map.containsKey(ar)) {
                i = i + map.get(ar);
            }
        }
        return i;
    }
}