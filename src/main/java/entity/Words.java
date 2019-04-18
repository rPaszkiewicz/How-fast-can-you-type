package entity;
import api.WordsInterface;
import java.util.ArrayList;

public class Words implements WordsInterface  {

    private ArrayList<String> wordsToPrintOut;

    public Words(){
        this.wordsToPrintOut = new ArrayList<>();
    }

    public void addWords(String word){
            wordsToPrintOut.add(word);
    }

    public void deleteWords(){
        wordsToPrintOut.clear();
    }

    public void deleteWords(int index){
        wordsToPrintOut.remove(index);
    }

    public void deleteWords(String word){
        wordsToPrintOut.remove(word);
    }

    public void print(){
        for (String s : wordsToPrintOut)
            System.out.println(s);
    }
}
