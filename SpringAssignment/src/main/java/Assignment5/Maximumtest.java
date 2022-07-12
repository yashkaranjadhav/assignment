package Assignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Maximumtest {
	
public static void main(String[] args)
{
	ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationcontext.xml");
	
	StreamMaximum max= (StreamMaximum) ctx.getBean("maximum");
	
	max.show();
	max.maxNum();
	
	
	
	
}

}
