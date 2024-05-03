class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         // Create a hashmap to store the groups of anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate through each word in the array
        for (String str : strs) {
            // Convert the word to a char array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            // If the sorted string is not in the hashmap, add it with an empty list
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            
            // Add the original word to the list corresponding to its sorted form
            map.get(sortedStr).add(str);
        }
        
        // Return the values of the hashmap as the result
        return new ArrayList<>(map.values());
    
    }
}