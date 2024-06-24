package Q1;

public class WordCounter {

    public static void countWordsInLine(String line, HashTable wordCount) {
        line = line.toLowerCase();
        String[] words = line.split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.increment(word);
            }
        }
    }

    public static void main(String[] args) {
        String line = "Hello world! This is a test. Hello world!";
        HashTable wordCount = new HashTable(100);
        countWordsInLine(line, wordCount);
        wordCount.printEntries();
    }
}
