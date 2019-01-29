package io.naztech.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;


public class MonthTest {

	@Test
	public void testparseMonth() {
		assertNotNull(Month.parseMonth("JanUAry"));
		assertNull(Month.parseMonth("ja"));
		assertNull(Month.parseMonth("decm"));
	}

	@Test
	public void testparseMonthFullNames() {
		assertEquals(Month.JANUARY, Month.parseMonth("January"));
		assertEquals(Month.FEBRUARY, Month.parseMonth("February"));
		assertEquals(Month.MARCH, Month.parseMonth("March"));
	}

	@Test
	public void testparseMonthShortNames() {
		assertEquals(Month.JANUARY, Month.parseMonth("jan"));
		assertEquals(Month.FEBRUARY, Month.parseMonth("Feb"));
		assertEquals(Month.MARCH, Month.parseMonth("Mar"));
		assertEquals(Month.APRIL, Month.parseMonth("APR"));
		assertEquals(Month.MAY, Month.parseMonth("may"));
	}

	@Test
	public void testGetShortNames() {
		assertEquals("Jan", Month.JANUARY.getShortName());
		assertEquals("Feb", Month.FEBRUARY.getShortName());
		assertEquals("Mar", Month.MARCH.getShortName());
		assertEquals("Sep", Month.SEPTEMBER.getShortName());
	}

	@Test
	public void testDaysInMonth() {
		assertEquals(31, Month.JANUARY.daysInMonth());
		assertEquals(28, Month.FEBRUARY.daysInMonth());
		//assertEquals(29, Month.FEBRUARY.daysInMonth());
	}

}
