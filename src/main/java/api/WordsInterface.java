package api;
public interface WordsInterface {
    void addWords(String word);
    void deleteWords();
    void deleteWords(int index);
    void deleteWords(String word);
    void print();
}
