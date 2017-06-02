package test_list;

import homeworks.imitation_arraylist.ImitationArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 * Created by Shaddowrunner on 26.05.2017.
 */
public class ImitationArrayListTest {

    @Rule
    public final SystemOutRule outRule
             = new SystemOutRule().enableLog();

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

    @Test
    public void shouldAddSeize() {
        list.setArray(new int[1]);
        list.addSize(1);

        Assert.assertEquals("should increase on one", 2, list.getArray().length);
    }

    @Test
    public void shouldDecrease() {
        list.setArray(new int[2]);
        list.decreaseSize(1);

        Assert.assertEquals(1, list.getArray().length);
    }

    @Test
    public void shouldChangeElementByIndex() {
        list.addElement(3);
        list.changeElementByIndex(0, 5);

        Assert.assertEquals(5, list.getArray()[0]);
    }

    @Test
    public void shouldBubbleSort() {
        list.addElement(5);
        list.addElement(21);
        list.addElement(17);
        list.bubbleSort();

        Assert.assertEquals("First element should be 21", 21, list.getArray()[0]);
    }

    @Test
    public void shouldShowElementsByRightOrder() {
        list.addElement(5);
        list.addElement(21);
        list.addElement(17);

        list.showElementsByRightOrder();

        Assert.assertEquals("Should show array in right order", "5 21 17 0 0 0 0 0 0 0 ", outRule.getLog());
    }

    @Test
    public void shouldShowElementsByReversOrder() {
        list.addElement(5);
        list.addElement(21);
        list.addElement(17);

        list.showElementsByInverseOrder();

        Assert.assertEquals("Should show array in revers order", "0 0 0 0 0 0 0 17 21 5 ", outRule.getLog());
    }
}
