import org.junit.jupiter.api.Test;

import java.util.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SieveOfEratosthenesTest {
    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints)
            list.add(i);
        return list;
    }

    @Test
    public void testOne() throws Exception {
        assertEquals(list(),new SieveOfEratosthenes().generate(1, 1));
    }

    @Test
    public void testRange() throws Exception {
        assertEquals(list(7901,7907,7919), new SieveOfEratosthenes().generate(7900, 7920));
    }

    @Test
    public void testInverseRange() throws Exception {
        assertEquals(list(7901,7907,7919), new SieveOfEratosthenes().generate(7920, 7900));
    }
}