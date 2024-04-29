class Solution {
    public int firstUniqChar(String s) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> map = new HashMap<>();

        // Count the frequency of each character in the string
    
        
        for (char ch : s.toCharArray()) {
            int i = map.getOrDefault(ch, 0);
            map.put(ch, i + 1);
        }
        // Iterate through the string to find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            
            if (map.get(s.charAt(i)) == 1) {
                return i; // Found the first non-repeating character
            }
            
        }

        // If no non-repeating character is found, return -1
        return -1;
    }
}