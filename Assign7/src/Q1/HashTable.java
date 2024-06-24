package Q1;

import java.util.LinkedList;
import java.util.List;

public class HashTable {
    static class Entry {
        private String key;
        private int value;

        public Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE;
    private List<Entry>[] arr;

    public HashTable(int size) {
        SIZE = size;
        arr = new List[SIZE];
        for (int i = 0; i < SIZE; i++)
            arr[i] = new LinkedList<>();
    }

    private int h(String key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(String key, int value) {
        int slot = h(key);

        for (Entry e : arr[slot]) {
            if (e.key.equals(key)) {
                e.value = value;
                return;
            }
        }

        Entry e = new Entry(key, value);
        arr[slot].add(e);
    }

    public Integer get(String key) {
        int slot = h(key);

        for (Entry e : arr[slot]) {
            if (e.key.equals(key)) {
                return e.value;
            }
        }

        return null;
    }

    public void increment(String key) {
        int slot = h(key);

        for (Entry e : arr[slot]) {
            if (e.key.equals(key)) {
                e.value++;
                return;
            }
        }

        Entry e = new Entry(key, 1);
        arr[slot].add(e);
    }

    public void printEntries() {
        for (List<Entry> bucket : arr) {
            for (Entry entry : bucket) {
                System.out.println(entry.key + ": " + entry.value);
            }
        }
    }
}
