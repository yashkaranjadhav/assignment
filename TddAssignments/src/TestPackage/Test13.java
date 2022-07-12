package TestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CodePackage.Calculator;

class Test13 {

	@Test
            void add() {
		    	
		        assertEquals(28, Calculator.add(14, 14));
		    }
		    
		    @Test
		    void sub() {
		        assertEquals(5, Calculator.sub(10, 5));
		    }
		    @Test
		    void mul() { 
		        assertEquals(24, Calculator.mul(12, 2));
		    }
		    @Test
		    void div() {
		        assertEquals(10, Calculator.div(30, 3));
		    }
		    @Test
		    void mod() {
		        assertEquals(15, Calculator.mod(115, 20));
		    }
		    @Test
		    void power() {
		        assertEquals(64,Calculator.power(8, 2));
		    }
		    @Test
		    void sqrt() {
		        assertEquals(3, Calculator.sqrt(9));
		    
	}


}
