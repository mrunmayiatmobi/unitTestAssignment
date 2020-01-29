package calculater;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestString {
	@Test
	public void TestForEmpty()
	{
		try {
			assertEquals(0, AdditionV.addV(""));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void TestForNull()
	{
		try {
			assertEquals(0, AdditionV.addV(null));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void TestForAdd()
	{
		try {
			assertEquals(5, AdditionV.addV("2,3"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void TestForAddD()
	{
		try {
			assertEquals(15, AdditionV.addV("\n1,2\n3;4 5"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void TestForN()
	{
		try {
			AdditionV.addV("\n-2,3,1,-2");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			assertEquals("negative value not allow[-2, -2]",e.getMessage());
			
		}
	}
}
