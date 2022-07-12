package TestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CodePackage.Assignment7;

class Test7 {

	@Test
	void test() {
		assertEquals(654,Assignment7.reversenumber(456));
	}

}
