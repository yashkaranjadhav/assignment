package Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment1Test {

	
		public static void main(String[] args) {
			 ApplicationContext objCtx = new ClassPathXmlApplicationContext("applicationcontext.xml");
			assignment1 obj=(assignment1) objCtx.getBean("assignmen1");
			obj.show();

	
	
	
}
}