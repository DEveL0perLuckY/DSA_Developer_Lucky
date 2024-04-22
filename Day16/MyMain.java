class Solution {
    public boolean containsDuplicate(int[] nums) {
//         Set<Integer> set = new HashSet<>();     
//         int i = 0;
//         for(Integer x : nums){
//             i++;
//             set.add(x);
        
//         }
//         if(i==set.size()){
//         return false;
//         }
//         else{
//         return true;
//         }
         Set<Integer> set = new HashSet<>();
        
        for (int x : nums) {
            if (!set.add(x)) {
                return true; // Duplicate found
            }
        }
        
        return false; // No duplicates found
    }
}