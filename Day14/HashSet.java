class MyHashSet {

    boolean[] set;

    /** Initialize your data structure here. */
    public MyHashSet() {
        set = new boolean[1000001]; // Initialize the array to hold keys from 0 to 1000000
    }
    
    public void add(int key) {
        set[key] = true; // Set the value at index key to true to indicate presence of key
    }
    
    public void remove(int key) {
        set[key] = false; // Set the value at index key to false to indicate removal of key
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return set[key]; // Check if the value at index key is true
    }
}
