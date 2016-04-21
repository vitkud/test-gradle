package ru.vitkud.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		Main main = new Main();
		assertEquals(42, main.theUltimateQuestionOfLifeTheUniverseAndEverything());
	}

}
