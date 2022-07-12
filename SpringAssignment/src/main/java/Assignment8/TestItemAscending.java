package Assignment8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItemAscending {
	
public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("applicationcontext.xml");
		ItemsAscending item=(ItemsAscending) contex.getBean("listitem");
		
		item.show();
		System.out.println();

		
	item.ascending();
	System.out.println();
	item.descending();
	System.out.println();
		
	item.removeDuplicate();
		
	}
	
}
