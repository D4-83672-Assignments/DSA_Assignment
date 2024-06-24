package Q2;

public class ModeCalculator {

    public static int calculateMode(int[] arr) {
        HashTable hashTable = new HashTable(100);

        for (int num : arr) {
            hashTable.increment(num);
        }

        return hashTable.getMaxKey();
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 3, 3, 2, 1, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6};
        int mode = calculateMode(array);
        System.out.println("Mode of the array is: " + mode);
    }
}
