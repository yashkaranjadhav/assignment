package Assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee obj=(Employee) ctx.getBean("ibean4");
		Employee obj1=(Employee) ctx.getBean("ibean41");
		list.add(obj);
		list.add(obj1);

		List<Employee> sorted=list.stream().sorted((e1,e2) ->Double.compare(e1.salary,e2.salary)).collect(Collectors.toList());


		for (Employee emp:sorted) {
			emp.employeeDetails();
		}
	}

}
