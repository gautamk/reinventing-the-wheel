package reinventing_the_wheel.java.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: gautam
 * Date: 26/5/13
 * Time: 11:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayListTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test(expected = IllegalArgumentException.class)
    public void testCreateAnArrayListOfInvalidSize(){
        new ArrayList<Object>(-1);
    }

    @Test
    public void testIsEmptyWhenEmpty(){
        final ArrayList<Object> objects = new ArrayList<Object>();
        assertTrue(objects.isEmpty());
    }

    @Test
    public void testIsEmptyNotEmpty(){
        final ArrayList<Object> objects = new ArrayList<Object>(Arrays.asList("test"));
        assertFalse(objects.isEmpty());
    }


    @Test
    public void testGet() throws Exception {

    }

    @Test
    public void testSize() throws Exception {

    }
}
