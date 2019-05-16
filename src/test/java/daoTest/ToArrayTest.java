import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ToArrayTest {
    @Test
    public void toArray(){
        ArrayList<String> array = new ArrayList<>();
        String longString = "something smell combo jelly moon dancing";

        String[] st = longString.split("\\s+");
        for (int i = 0; i < st.length ; i++) { // collections.addAll
            array.add(st[i]);
        }
        Assert.assertEquals(array.toArray(),st);
    }
}
