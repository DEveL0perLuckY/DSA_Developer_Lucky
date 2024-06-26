class Solution {
   
    public boolean isHappy(int n) {
        HashSet<Integer> x = new HashSet<>();
        
        while (n != 1 && !x.contains(n)) {
            x.add(n);
            n = getNext(n);
        }
        
        return n == 1;
    }
    
    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}