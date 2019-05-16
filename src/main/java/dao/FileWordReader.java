package dao;

import java.io.*;
import java.util.ArrayList;

public class FileWordReader {
    private ArrayList list;
    public FileWordReader(){
        list = new ArrayList();
    }

    public void read()throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dev Mąż\\Desktop\\java projects\\FastTyping\\Words.txt"));
        String readFromFile = reader.readLine();
        String[] st = readFromFile.split("\\s+");
        reader.close();
        for (int i = 0; i<st.length; i++){
            list.add(st[i]);
        }
    }

    public void remove(String word){
        if (list.contains(word))
            list.remove(word);
    }

    public void print(){
        for (Object s:list)
            System.out.print(s + ", ");
        System.out.println("");
    }

    public ArrayList getWords(){
        return list;
    }

}
