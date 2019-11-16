package jp.enpit.cloud.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testMultiply01() throws Exception {
		Calculator calc = new Calculator();
		int expected =200;
		int actual = calc.multiply(10,20);
		assertEquals(expected,actual);
	}

	@Test
    public void testMultiply02() throws Exception{
	    Calculator calc = new Calculator();
		int expected =-200;
		int actual = calc.multiply(-10,20);
		assertEquals(expected,actual);
    }

    @Test
    public void testMultiply03() throws Exception{
	    Calculator calc = new Calculator();
		int expected =0;
		int actual = calc.multiply(0,-20);
		assertEquals(expected,actual);
    }

    @Test
    public void testMax01() throws Exception{
	    Calculator calc = new Calculator();
		int expected =30;
		int actual = calc.max(10,20,30);
		assertEquals(expected,actual);
    }

    @Test
    public void testMax02() throws Exception{
	    Calculator calc = new Calculator();
		int expected =30;
		int actual = calc.max(30,20,10);
		assertEquals(expected,actual);
    }

    @Test
    public void testMax03() throws Exception{
	    Calculator calc = new Calculator();
		int expected =30;
		int actual = calc.max(20,30,10);
		assertEquals(expected,actual);
    }

    @Test
    public void testMax04() throws Exception{
	    Calculator calc = new Calculator();
		int expected =30;
		int actual = calc.max(30,10,20);
		assertEquals(expected,actual);
    }

    @Test
    public void testMax05() throws Exception{
	    Calculator calc = new Calculator();
		int expected =30;
		int actual = calc.max(20,10,30);
		assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivide01() throws Exception{
	    Calculator calc = new Calculator();
	    calc.divide(10, 0);
    }


    @Test
    public void testDivide02() throws Exception{
	    Calculator calc = new Calculator();
        float actual = calc.divide(10, 20);
        float expected =(float)0.5;
        assertEquals(expected,actual,0);
    }

}
