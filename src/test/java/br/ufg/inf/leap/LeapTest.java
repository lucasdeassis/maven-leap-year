package br.ufg.inf.leap;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapTest {
	private Leap leap;

	public LeapTest() {
		this.leap = new Leap();
	}

	@Test
	public void testOddIsNotLeap() {
		assertFalse(leap.isLeap(2003));
	}

	@Test
	public void testEvenNotDivisibleBy100IsLeap() {
		assertTrue(leap.isLeap(1992));
	}

	@Test
	public void testEvenDivisibleBy100And400IsLeap() {
		assertTrue(leap.isLeap(2000));
	}

	@Test
	public void testEvenDivisibleBy100AndNot400IsNotLeap() {
		assertFalse(leap.isLeap(1900));
	}

	@Test
	public void testNegativeIsNotLeap() {
		assertFalse(leap.isLeap(-100));
	}
}
