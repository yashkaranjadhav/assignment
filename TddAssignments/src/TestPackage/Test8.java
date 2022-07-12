package TestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CodePackage.Assignment8;

class Test8 {

	@Test
public	void test() {
		assertEquals(3,Assignment8.count(new int[] {2,4,6,7}));
		
	}

}
