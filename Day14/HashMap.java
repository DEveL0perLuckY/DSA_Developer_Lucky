class MyHashMap {

    private final int SIZE = 1000;
    private LinkedList<Entry>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        for (Entry entry : buckets[index]) {
            if (entry.key == key) {
                entry.value = value; // Update the value if key exists
                return;
            }
        }
        buckets[index].add(new Entry(key, value)); // Add new key-value pair
    }

    public int get(int key) {
        int index = getIndex(key);
        if (buckets[index] == null)
            return -1;
        for (Entry entry : buckets[index]) {
            if (entry.key == key) {
                return entry.value; // Return the value if key exists
            }
        }
        return -1; // Return -1 if key not found
    }

    public void remove(int key) {
        int index = getIndex(key);
        if (buckets[index] == null)
            return;
        Iterator<Entry> iterator = buckets[index].iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            if (entry.key == key) {
                iterator.remove(); // Remove the key-value pair
                return;
            }
        }
    }

    private int getIndex(int key) {
        return Integer.hashCode(key) % SIZE;
    }

    private class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */