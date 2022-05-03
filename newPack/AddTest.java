package newPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		MyJUnit mj = new MyJUnit();
		int result = mj.add(20, 30);
		assertEquals(50, result);
	}

}
