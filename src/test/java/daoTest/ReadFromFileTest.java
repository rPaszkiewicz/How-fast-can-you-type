import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFileTest {

    @Test
    public void read()throws IOException {
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("Words.txt"));
        String readFromFile = reader.readLine();
        String[] token = readFromFile.split("\\s+");

        for (int i=0; i<token.length; i++){
            list.add(token[i]);
        }
        Assert.assertEquals(list.toArray(),token);
    }
}
