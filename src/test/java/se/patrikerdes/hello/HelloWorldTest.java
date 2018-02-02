package se.patrikerdes.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    void testPassing() {
        assertEquals(true, true);
    }

    @Test
    void testFailing() {
        assertEquals(true, false);
    }
}
