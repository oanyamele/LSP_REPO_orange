package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerSetTest {

    @Test
    void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    void testLength() {
        IntegerSet set = new IntegerSet();
        assertEquals(0, set.length());

        set.add(1);
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test
    void testEquals() {
        IntegerSet a = new IntegerSet();
        IntegerSet b = new IntegerSet();

        a.add(1);
        a.add(2);
        a.add(3);

        b.add(3);
        b.add(2);
        b.add(1);

        assertTrue(a.equals(b));

        b.add(4);
        assertFalse(a.equals(b));
    }

    @Test
    void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(1);

        assertTrue(set.contains(1));
        assertFalse(set.contains(99));
    }

    @Test
    void testLargest() {
        IntegerSet set = new IntegerSet();
        set.add(5);

        assertEquals(5, set.largest());

        IntegerSet empty = new IntegerSet();
        assertThrows(IllegalStateException.class, empty::largest);
    }

    @Test
    void testSmallest() {
        IntegerSet set = new IntegerSet();
        set.add(5);

        assertEquals(5, set.smallest());

        IntegerSet empty = new IntegerSet();
        assertThrows(IllegalStateException.class, empty::smallest);
    }

    @Test
    void testAdd() {
        IntegerSet set = new IntegerSet();

        set.add(1);
        set.add(1);

        assertEquals(1, set.length());
    }

    @Test
    void testRemove() {
        IntegerSet set = new IntegerSet();

        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1));

        set.remove(999);
        assertTrue(set.isEmpty());
    }

    @Test
    void testUnion() {
        IntegerSet a = new IntegerSet();
        IntegerSet b = new IntegerSet();

        a.add(1);
        a.add(2);

        b.add(2);
        b.add(3);

        assertEquals("[1, 2, 3]", a.union(b).toString());

        IntegerSet empty = new IntegerSet();
        assertEquals("[1, 2]", a.union(empty).toString());
    }

    @Test
    void testIntersect() {
        IntegerSet a = new IntegerSet();
        IntegerSet b = new IntegerSet();

        a.add(1);
        a.add(2);

        b.add(2);
        b.add(3);

        assertEquals("[2]", a.intersect(b).toString());

        IntegerSet noOverlap = new IntegerSet();
        noOverlap.add(99);

        assertEquals("[]", a.intersect(noOverlap).toString());
    }

    @Test
    void testDiff() {
        IntegerSet a = new IntegerSet();
        IntegerSet b = new IntegerSet();

        a.add(1);
        a.add(2);

        b.add(2);

        assertEquals("[1]", a.diff(b).toString());

        IntegerSet identical = new IntegerSet();
        identical.add(1);
        identical.add(2);

        assertEquals("[]", a.diff(identical).toString());
    }

    @Test
    void testComplement() {
        IntegerSet a = new IntegerSet();
        IntegerSet b = new IntegerSet();

        a.add(1);
        b.add(2);

        assertEquals("[2]", a.complement(b).toString());

        IntegerSet c = new IntegerSet();
        c.add(1);
        c.add(2);
        c.add(3);

        assertEquals("[2, 3]", a.complement(c).toString());
    }

    @Test
    void testIsEmpty() {
        IntegerSet set = new IntegerSet();

        assertTrue(set.isEmpty());

        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    void testToString() {
        IntegerSet set = new IntegerSet();

        assertEquals("[]", set.toString());

        set.add(3);
        set.add(1);
        set.add(2);

        assertEquals("[1, 2, 3]", set.toString());
    }
}