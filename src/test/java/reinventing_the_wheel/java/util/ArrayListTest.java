package reinventing_the_wheel.java.util;

import org.junit.After;

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

    ArrayList<Object> objects;
    @Before
    public void setUp() throws Exception {
        objects = new ArrayList<Object>();
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
        assertTrue(objects.isEmpty());
    }

    @Test
    public void testIsEmptyNotEmpty(){
        final ArrayList<Object> objects = new ArrayList<Object>(Arrays.asList("test"));
        assertFalse(objects.isEmpty());
    }


    @Test
    public void testEmptySize() throws Exception {
        final ArrayList<Object> empty = new ArrayList<Object>(Arrays.asList());
        assertEquals(0,empty.size());
    }
    @Test
    public void testNonEmptySize() throws Exception {
        final ArrayList<Object> one = new ArrayList<Object>(Arrays.asList("One"));
        assertEquals(1,one.size());
    }

    @Test
    public void testContains() {
        final ArrayList<Object> al = new ArrayList<Object>(Arrays.asList("One","two","Three","Four"));
        assertTrue(al.contains("One"));
        assertTrue(al.contains("Four"));
        assertFalse(al.contains("Two"));
        assertFalse(al.contains("alskjdl"));
    }

    @Test
    public void testIndexOfNull() {
        final ArrayList<Object> al = new ArrayList<Object>(Arrays.asList("zero","one","two","three",null));
        assertEquals(4,al.indexOf(null));
    }

    @Test
    public void testIndexOfNonExistent() {
        final ArrayList<Object> al = new ArrayList<Object>(Arrays.asList("zero","one","two","three",null));
        assertEquals(-1,al.indexOf("nonExistent"));
    }
    @Test
    public void testIndexOf() {
        final ArrayList<Object> al = new ArrayList<Object>(Arrays.asList("zero","one","two","three",null));
        assertEquals(0,al.indexOf("zero"));
        assertEquals(1,al.indexOf("one"));
        assertEquals(2,al.indexOf("two"));
    }

    @Test
    public void testIndexOfGetsOnlyFirstIndex(){
        final ArrayList<Object> al = new ArrayList<Object>(Arrays.asList("zero","one","one","two","three",null));
        assertEquals(0,al.indexOf("zero"));
        assertNotEquals(2,al.indexOf("one"));
    }





}
