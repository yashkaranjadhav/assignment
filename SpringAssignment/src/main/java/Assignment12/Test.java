package Assignment12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Department> dlist=new ArrayList<Department>();
		ApplicationContext objctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Department obj1 = (Department) objctx.getBean("objdept");
		Department obj2 = (Department) objctx.getBean("objdept1");
		Department obj3 = (Department) objctx.getBean("objdept2");
		Department obj4 = (Department) objctx.getBean("objdept3");
		Department obj5 = (Department) objctx.getBean("objdept4");
		dlist.add(obj1);
		dlist.add(obj2);
		dlist.add(obj3);
		dlist.add(obj4);
		dlist.add(obj5);
		for(Department s:dlist) {
			System.out.println(s.deptname+" "+ s.empobj.empname+" "+ s.empobj.salary);
			
		}
		
		
		Department sobj = dlist.stream().max( (s1,s2)->s1.empobj.salary>s2.empobj.salary?1:-1).get();
		System.out.println("Highest salary Emp name :"+sobj.empobj.empname +" "+"salary"+sobj.empobj.salary);

		double aveSalary=dlist.stream().collect(Collectors.averagingDouble(i->i.empobj.salary));
		System.out.println("Average salary : "+aveSalary);
		System.out.println("name of the emp havaing salary less than average salary");
		
		
		
		List<Department> ave=dlist.stream().filter(i->i.empobj.salary<aveSalary).collect(Collectors.toList());
		
		for(Department e:ave)
		{
			System.out.println(e. empobj.empname+"  "+e.empobj.salary);
		}
		
		
		
		System.out.println();
		
		System.out.println("average salary of each dept");
		
//		Map<String, Double> avgSalaryOfDepartments=
//		        dlist.stream().collect(Collectors.groupingBy(Department::getDeptname, Collectors.averagingDouble(Department::empobj.getSalary)));       
//	        Set<Entry<String, Double>> entrySet1 = avgSalaryOfDepartments.entrySet();       
//		        for (Entry<String, Double> entry : entrySet1) 
//		        {
//		             System.out.println(entry.getKey()+" : "+entry.getValue());
//		        }
		        
		}
		

	        
	}


	

	


