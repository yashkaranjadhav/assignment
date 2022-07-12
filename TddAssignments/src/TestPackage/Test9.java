package TestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CodePackage.Assignment9;

class Test9 {

	@Test
	void test() {
		assertEquals("This Red car",Assignment9.removespechar("This@Red$car-"));
	}

}


