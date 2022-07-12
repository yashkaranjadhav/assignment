package TestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import CodePackage.Item;

class Test15 {

	  @AfterEach
	    void tearDown() throws Exception {


	    }
	    @Test
	    void test() {
	        Item i = new Item (1,"pencil", 200,500,LocalDate.of(2022,11,23),LocalDate.of(2023, 2, 22));

	        assertEquals(true,i.createObject(i));
	    }
	    }



