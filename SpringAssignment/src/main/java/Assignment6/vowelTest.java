package Assignment6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class vowelTest {
	
	public static void main(String[] args) {
		
		
			
			ApplicationContext cntx=new ClassPathXmlApplicationContext("applicationcontext.xml");
			vowel vowel=(vowel)cntx.getBean("vowl");
			
			vowel.result();
		}
		
		
	}


