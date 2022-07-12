package Assignment7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArrayTest {
	
public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Array1 arr=(Array1) contex.getBean("array");
		arr.merge();
	}

}

