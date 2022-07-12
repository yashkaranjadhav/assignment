package TestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CodePackage.Assignment2;

class Test2 {

	@Test
	void test() {
		assertEquals("palindrome",Assignment2.palindrome("karan","kiran"));
	}

}
