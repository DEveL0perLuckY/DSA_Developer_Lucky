class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> x= new HashSet<>();
        for(int y : nums){
           if(!x.add(y)){
               x.remove(y);
           }
        }
        for(int i:x){
            return i;
        }
        return -1;
    }
}