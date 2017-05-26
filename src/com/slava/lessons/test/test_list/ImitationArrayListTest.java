package test_list;

import homeworks.imitation_arraylist.ImitationArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Shaddowrunner on 26.05.2017.
 */
public class ImitationArrayListTest {

    private ImitationArrayList list;

    @Before
    public void beforeEachTest() {
        list = new ImitationArrayList();
    }

    @Test
    public void shouldAddElementToArray() {
        list.addElement(5);
        Assert.assertEquals("First Element should be 5 ", 5, list.getArray()[0]);
    }

    @Test
    public void shouldResizeArray() {
        list.setArray(new int[1]);
        list.addElement(5);
        list.addElement(3);

        Assert.assertEquals("should increase in two times", 2, list.getArray().length);
    }
}
