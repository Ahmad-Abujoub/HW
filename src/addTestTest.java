import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTestTest {

	@Test
	void test() {
		addTest ht=new addTest();
		int result=ht.add(4, 9);
		assertEquals(13,result);
	}

}
