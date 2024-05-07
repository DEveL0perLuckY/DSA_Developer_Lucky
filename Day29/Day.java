class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null)
            return 0;
        if (s.equals(""))
            return 0;

        HashMap<String, Integer> map = new HashMap<>();
        String[] sts = s.split("");

        int maxlen = 0;

        for (int i = 0, j = 0; i < sts.length; i++, j++) {
            if (!map.containsKey(sts[i]))
                map.put(sts[i], i);
            else {
                i = map.get(sts[i]);
                map.clear();
            }

            if (maxlen < map.size())
                maxlen = map.size();
        }

        return maxlen;
    }
}