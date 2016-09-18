package rs.csc413f16p1a;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by marc on 9/7/16.
 */
public class MainActivityTest {

    @Test
    public void testAbs() throws Exception {

        System.out.println("Running MainActivity unit tests");

        MainActivity ma = new MainActivity();

        assertEquals(5, ma.abs(-5));

    }
}