package org.example;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.example.BinarySearchAndrii.*;

public class TestBinarySearchAndrii {

    @Test
    public void testSearch1() {
        int[] a = { 1, 3, 5, 7 };
        assertTrue(search(a, 3) == 1);
    }

    @Test
    public void testCheckedSearch() {
        int[] a = { 1, 3, 4, 5, 8, 12, 15 };
        assertTrue(checkedSearch(a, 12) == 5);
    }
}
