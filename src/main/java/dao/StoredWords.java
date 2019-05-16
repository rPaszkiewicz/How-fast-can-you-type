package entity;

import java.util.ArrayList;

public class StoredWords{

    private ArrayList<String> list;

    public StoredWords(){
        this.list = new ArrayList<>();
        list.add("shit");
        list.add("happends");
        list.add("bubble");
        list.add("gray");
    }

    public void print(){
        for (String s : list)
            System.out.print(s + ", ");
    }

    public ArrayList<String> getWords(){
        return list;
    }

    public void remove(String word){
        list.remove(word);
    }

}
