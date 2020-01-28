package com.clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClockTest {
	@Test
	public void testSecondsWhenSecndsIsEven() {
		assertEquals("YRRROROOOYYRYYRYYRYYYYYY",Convert.colourC("16:59:58"));
		//Y YYRYYYOOOOO ORRROROOO
	}
	@Test
	public void testSecondsWhenSecndsIsOdd() {
		assertEquals("ORRRRRRROYYRYYRYYRYYYYYY",Convert.colourC("23:59:59"));
	}
	@Test
	public void testForMinutes() {
		assertEquals("YRRROROOOYYRYYRYYRYOYOOO",Convert.colourC("16:51:06"));
	}
	@Test
	public void testForMinutesLower() {
		assertEquals("ORRRRRRROYYRYYRYYRYYYYOO",Convert.colourC("23:57:59"));
	}
	@Test
	public void testForHours() {
		assertEquals("YRRROROOOYYRYYRYYRYOOOOO",Convert.colourC("16:50:06"));
	}
	@Test
	public void testForHoursLower() {
		assertEquals("ORRRRRRROYYRYYRYYRYYYYYY",Convert.colourC("23:59:59"));
	}
	@Test
	public void testForAllZero()
	{
		assertEquals("YOOOOOOOOOOOOOOOOOOOOOOO",Convert.colourC("00:00:00"));
	}
	@Test
	public void testForSecond()
	{
		assertEquals("OOOOOOOOOOOOOOOOOOOOOOOO",Convert.colourC("00:00:01"));
	}
	@Test
	public void testForMinutesOnly()
	{
		assertEquals("YOOOOOOOOOOOOOOOOOOOYOOO",Convert.colourC("00:01:00"));
	}
}
