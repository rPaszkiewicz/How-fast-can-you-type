package daoTest;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Collections;

public class RemoveFromListTest {

    @Test
    public void remove(){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"woof","meow","neigh");

        list.remove("meow");

        Assert.assertNotEquals("[woof,meow,neigh]",list.toArray());
    }
}
