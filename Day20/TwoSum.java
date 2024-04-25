class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int[] result = new int[2];
        
        // create an empty result array of size 2
        // for storing index
        
        for (int i = 0; i < nums.length; i++) {
            
            //  x + y = target
            //2,7,11,15
            //target = 9
            
            int x = target - nums[i];
            
            // Check if the x exists in map
            if (map.containsKey(x)) {
            
                result[0] = map.get(x);
                result[1] = i;
                break;
            }
            
            map.put(nums[i], i);  // we add this in last bkz in above the if condition is chaeck 
            // after that on put the value our index will update if similr value is found
            //               ( key  , value )
            // store data in (value , index)
        }

        return result;
    
    }
}