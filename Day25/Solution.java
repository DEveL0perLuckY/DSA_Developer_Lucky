class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int x :nums){
        //     map.put(x,map.getOrDefault(x,0)+1);
        //     if(map.get(x) <k &&map.get(x)>0){
        //         return true;
        //     }
        // }
        // return false;
        
        HashMap<Integer,Integer> map = new HashMap<>();
       
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num) && i - map.get(num) <= k) {
                return true;
            }
            map.put(num, i);
        }
        return false;
  
    }
}