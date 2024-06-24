package Q2;



import java.util.LinkedList;
import java.util.List;

public class HashTable {
    static class Entry {
        private int key;
        private int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE;
    private List<Entry>[] arr;

    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        SIZE = size;
        arr = new List[SIZE];
        for (int i = 0; i < SIZE; i++)
            arr[i] = new LinkedList<>();
    }

    private int h(int key) {
        return Math.abs(key) % SIZE;
    }

    public void increment(int key) {
        int slot = h(key);

        for (Entry e : arr[slot]) {
            if (e.key == key) {
                e.value++;
                return;
            }
        }

        Entry e = new Entry(key, 1);
        arr[slot].add(e);
    }

    public int getMaxKey() {
        int maxKey = -1;
        int maxValue = 0;

        for (List<Entry> bucket : arr) {
            for (Entry entry : bucket) {
                if (entry.value > maxValue) {
                    maxValue = entry.value;
                    maxKey = entry.key;
                }
            }
        }

        return maxKey;
    }
}

