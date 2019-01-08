package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestsCalc {
	@Test
	public void TestSum()
	{
		CalcCls target = new CalcCls();
		int actual, expected=40;
		actual = target.Sum(10, 30);
		assertEquals(expected, actual);
	}
	@Test
	public void TestSubt()
	{
		CalcCls target = new CalcCls();
		int actual, expected=40;
		actual = target.Subt(10, 30);
		assertEquals(expected,actual);
	}

}
