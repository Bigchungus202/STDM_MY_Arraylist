
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;


public class MyArrayListOGTest {

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

//    @Ignore
	@Test
    public void testNew() {
        MyArrayListOG mal = new MyArrayListOG();
        assertNotNull(mal);
    }

    //@Ignore
	@Test
    public void testNewAndSize() {
        MyArrayListOG mal = new MyArrayListOG();
        assertEquals(0, mal.size());
    }

    //@Ignore
	@Test
    public void testAdd1() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        assertEquals(1, mal.size());
    }

    //@Ignore
	@Test
    public void testAdd2() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        assertEquals(1, mal.size());
        mal.add("zwei");
        assertEquals(2, mal.size());
    }

    //@Ignore
	@Test
    public void testGet1() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        String res = mal.get(0);
        assertEquals("eins", res);
    }

    //@Ignore
	@Test
    public void testGet2() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        mal.add("zwei");
        String res = mal.get(1);
        assertEquals("zwei", res);
    }

    //@Ignore
	@Test
    public void testGet3() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        mal.add("zwei");
        mal.add("drei");
        String res = mal.get(0);
        assertEquals("eins", res);
        res = mal.get(1);
        assertEquals("zwei", res);
        res = mal.get(2);
        assertEquals("drei", res);
    }

        //@Ignore
	@Test
    public void testAdd10() {
        MyArrayListOG mal = new MyArrayListOG();
        for (int i=0;i<10;i++) {
            String s = String.format("Element%02d", i);
            mal.add(s);
            assertEquals(i+1, mal.size());
            assertEquals(s,mal.get(i));
        }
    }

    //@Ignore
	@Test
    public void testAddAtIndex() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        mal.add("zwei");
        mal.add("drei");
        mal.add(1, "einsA");
        String res = mal.get(0);
        assertEquals("eins", res);
        res = mal.get(1);
        assertEquals("einsA", res);
        res = mal.get(2);
        assertEquals("zwei", res);
    }

    //@Ignore
	@Test
    public void testAddAtIndex0() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        mal.add("zwei");
        mal.add("drei");
        mal.add(0, "null");
        String res = mal.get(0);
        assertEquals("null", res);
        res = mal.get(1);
        assertEquals("eins", res);
        res = mal.get(2);
        assertEquals("zwei", res);
        assertEquals(4, mal.size());
    }

    //@Ignore
	@Test
    public void testRemoveHead() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        mal.add("zwei");
        mal.add("drei");
        assertTrue(mal.remove("eins"));
        String res = mal.get(0);
        assertEquals("zwei", res);
        assertEquals(2, mal.size());
        assertFalse(mal.contains("eins"));
    }

    //@Ignore
	@Test
    public void testRemoveTail() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        mal.add("zwei");
        mal.add("drei");
        mal.remove("drei");
        String res = mal.get(1);
        assertEquals("zwei", res);
        assertEquals(2, mal.size());
    }

    //@Ignore
	@Test
    public void testRemoveIndex1() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        mal.add("zwei");
        mal.add("drei");
        String res = mal.remove(1);
        assertEquals("zwei", res);
        res = mal.get(0);
        assertEquals("eins", res);
        res = mal.get(1);
        assertEquals("drei", res);
        assertEquals(2, mal.size());
    }

        //@Ignore
	@Test
    public void testRemoveNone() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        mal.add("zwei");
        mal.add("drei");
        boolean res = mal.remove("zwei");
        assertTrue(res); 
        res = mal.remove("zwei");
        assertFalse(res);
    }
    
    //@Ignore
	@Test
    public void testRemoveIndex0() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        mal.add("zwei");
        mal.add("drei");
        String res = mal.remove(0);
        assertEquals("eins", res);
        res = mal.get(0);
        assertEquals("zwei", res);
        res = mal.get(1);
        assertEquals("drei", res);
        assertEquals(2, mal.size());
    }

    //@Ignore
	@Test
    public void testRemoveIndexLast() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        mal.add("zwei");
        mal.add("drei");
        String res = mal.remove(mal.size() - 1);
        assertEquals("drei", res);
        assertFalse(mal.contains("drei"));
        res = mal.get(0);
        assertEquals("eins", res);
        res = mal.get(1);
        assertEquals("zwei", res);
        assertEquals(2, mal.size());
    }

   //@Ignore
	@Test
    public void testContains() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        assertTrue(mal.contains("eins"));
        assertFalse(mal.contains("zwei"));
        mal.add("zwei");
        assertTrue(mal.contains("eins"));
        assertTrue(mal.contains("zwei"));
        assertFalse(mal.contains("drei"));
        mal.add("drei");
        assertTrue(mal.contains("eins"));
        assertTrue(mal.contains("zwei"));
        assertTrue(mal.contains("drei"));
        assertFalse(mal.contains("vier"));
    }

    //@Ignore
    @Test
    public void testContains2() {
        MyArrayListOG mal = new MyArrayListOG();
        String s = "ei";
        s += "ns";
        mal.add(s);
        assertTrue(mal.contains("eins"));
        assertFalse(mal.contains("zwei"));
     }
    
    //@Ignore
	@Test
    public void testClearAndAdd() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        assertTrue(mal.contains("eins"));
        assertFalse(mal.contains("zwei"));
        mal.clear();
        assertFalse(mal.contains("eins"));
        assertEquals(0, mal.size());
        mal.add("eins");
        assertTrue(mal.contains("eins"));
    }

    //@Ignore
	@Test
    public void testSet1() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        mal.add("zwei");
        mal.add("drei");
        String res = mal.set(1, "zweiNeu");
        assertEquals("zwei", res);
        res = mal.get(0);
        assertEquals("eins", res);
        res = mal.get(1);
        assertEquals("zweiNeu", res);
        res = mal.get(2);
        assertEquals("drei", res);
        assertEquals(3, mal.size());
    }

    //@Ignore
	@Test
    public void testIndexOf() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        mal.add("zwei");
        mal.add("drei");
        mal.add("eins");
        assertEquals(0, mal.indexOf("eins"));
        assertEquals(1, mal.indexOf("zwei"));
        assertEquals(2, mal.indexOf("drei"));
        assertEquals(-1, mal.indexOf("vier"));
    }

    //@Ignore
	@Test
    public void testLastIndexOf() {
        MyArrayListOG mal = new MyArrayListOG();
        mal.add("eins");
        mal.add("zwei");
        mal.add("drei");
        mal.add("eins");
        assertEquals(3, mal.lastIndexOf("eins"));
        assertEquals(1, mal.lastIndexOf("zwei"));
        assertEquals(2, mal.lastIndexOf("drei"));
        assertEquals(-1, mal.lastIndexOf("vier"));
    }

    //@Ignore
	@Test
    public void testManyOperations() {
        MyArrayListOG mal = new MyArrayListOG();
        for (int i = 0; i < 1000; i++) {
            String s = "test" + i;
            mal.add(s);
            assertTrue(mal.contains(s));
            assertEquals(1 + i, mal.size());
        }
        for (int i = 0; i < 1000; i += 2) {
            String s = "test" + i;
            mal.remove(s);
            assertFalse(mal.contains(s));
            assertEquals(999 - i / 2, mal.size());
        }
        assertEquals(500, mal.size());
        for (int i = 0; i < 1000; i += 2) {
            String s = "toast" + i;
            mal.add(i, s);
            assertTrue(mal.contains(s));
            assertEquals(501 + i / 2, mal.size());
        }
        for (int i = 0; i < 1000; i++) {
            String res = mal.get(i);
            if (i % 2 == 0) {
                assertEquals("toast" + i, res);
            } else {
                assertEquals("test" + i, res);
            }
        }

    }
}
