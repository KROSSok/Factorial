package com.company;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


public class UnitTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testFactorial() throws Exception{
        Factorial factorial = new Factorial();
        assertEquals(120, factorial.factorial(5));
        assertEquals(3628800, factorial.factorial(10));
        assertEquals(1, factorial.factorial(1));
        assertEquals(1, factorial.factorial(0));
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Invalid number");
        factorial.factorial(-10);
    }
    @Test
    public void testRecFactorial() throws Exception{
        RecFactorial recFactorial = new RecFactorial();
        assertEquals(120, recFactorial.factorial(5));
        assertEquals(3628800, recFactorial.factorial(10));
        assertEquals(1, recFactorial.factorial(1));
        assertEquals(1, recFactorial.factorial(0));
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Invalid number");
        recFactorial.factorial(-10);
    }

}
