package Assignment11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args)

	{
		
      Scanner sc =new Scanner(System.in);
   
		List<Stud> studlist = new ArrayList<Stud>();

		ApplicationContext objctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Stud obj1 = (Stud) objctx.getBean("objstud");
		Stud obj2 = (Stud) objctx.getBean("objstud1");
		Stud obj3 = (Stud) objctx.getBean("objstud2");
		Stud obj4 = (Stud) objctx.getBean("objstud3");
		Stud obj5 = (Stud) objctx.getBean("objstud4");

		studlist.add(obj1);
		studlist.add(obj2); 
		studlist.add(obj3);
		studlist.add(obj4);
		studlist.add(obj5);
		
		for(Stud s: studlist) {
			System.out.println(s.Roll_no+" "+ s.sname+" "+ s.obj.total_mark);
		}
		
		
		System.out.println("Enter total marks");
		   int total=sc.nextInt();
		List<Stud> studlsit2= studlist.stream().filter(s->s.obj.total_mark==total).collect(Collectors.toList());
   for( Stud s2:studlsit2) {
	   System.out.println(s2.Roll_no+" "+s2.sname);
   }
		
		
	}
	
	
	

}
