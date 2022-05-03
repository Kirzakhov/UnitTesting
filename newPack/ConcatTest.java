package newPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void test() {
		MyJUnit mj = new MyJUnit();
		String result = mj.concat("Vivek", " Kumar");
		assertEquals("Vivek Kumar", result);
	}

}
