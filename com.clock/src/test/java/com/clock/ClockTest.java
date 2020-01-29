package com.clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClockTest {
	@Test
	public void testSecondsWhenSecndsIsEven() throws Exception {
		assertEquals("YRRROROOOYYRYYRYYRYYYYYY",Convert.colourC("16:59:58"));
		//Y YYRYYYOOOOO ORRROROOO
	}
	@Test
	public void testSecondsWhenSecndsIsOdd() throws Exception {
		assertEquals("ORRRRRRROYYRYYRYYRYYYYYY",Convert.colourC("23:59:59"));
	}
	@Test
	public void testForMinutes() throws Exception {
		assertEquals("YRRROROOOYYRYYRYYRYOYOOO",Convert.colourC("16:51:06"));
	}
	@Test
	public void testForMinutesLower() throws Exception {
		assertEquals("ORRRRRRROYYRYYRYYRYYYYOO",Convert.colourC("23:57:59"));
	}
	@Test
	public void testForHours() throws Exception {
		assertEquals("YRRROROOOYYRYYRYYRYOOOOO",Convert.colourC("16:50:06"));
	}
	@Test
	public void testForHoursLower() throws Exception {
		assertEquals("ORRRRRRROYYRYYRYYRYYYYYY",Convert.colourC("23:59:59"));
	}
	@Test
	public void testForAllZero() throws Exception
	{
		assertEquals("YOOOOOOOOOOOOOOOOOOOOOOO",Convert.colourC("00:00:00"));
	}
	@Test
	public void testForSecond()
	{
		try {
			assertEquals("OOOOOOOOOOOOOOOOOOOOOOOO",Convert.colourC("00:00:01"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testForMinutesOnly() throws Exception
	{
		assertEquals("YOOOOOOOOOOOOOOOOOOOYOOO",Convert.colourC("00:01:00"));
	}
	@Test
	public void testForNull()
	{
		try {
			Convert.colourC("");
		} catch (Exception e) {
			assertEquals("Time Not provied or Invalid Time Format",e.getMessage());
		}
	}
	@Test
	public void testForInvalid()
	{
		try {
			Convert.colourC("00:01:0");
		} catch (Exception e) {
			assertEquals("Time Not provied or Invalid Time Format",e.getMessage());
		}
	}
	@Test
	public void testForOneSpace()
	{
		try {
			Convert.colourC(" ");
		} catch (Exception e) {
			assertEquals("Time Not provied or Invalid Time Format",e.getMessage());
		}
	}
	
	@Test
	public void testForInvalidMaxInput()
	{
		try {
			Convert.colourC("00:01:000");
		} catch (Exception e) {
			assertEquals("Invalid Time Format",e.getMessage());
		}
	}

}
