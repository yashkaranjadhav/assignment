package Assignments;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Assignment17Main {
	public static void main(String[] args) {
		
	
			List<Employee> list=new ArrayList<Employee>();
			list.add(new Employee("Kiran",LocalDate.of(1999, 06, 21),LocalDate.of(2020, 03, 21), LocalDate.of(2022, 03, 21),"baramati" , "Developer", 22000.0));
			list.add(new Employee("karan",LocalDate.of(1994, 02, 22),LocalDate.of(2018, 01, 01), LocalDate.of(2021, 01, 01),"satara" , "sales", 17000.0));
			list.add(new Employee("sahil",LocalDate.of(1997, 03, 13),LocalDate.of(2021, 05, 21), LocalDate.of(2022, 10, 11),"phaltan" , "Developer", 23000.0));
			list.add(new Employee("akash",LocalDate.of(1998, 04, 15),LocalDate.of(2021, 10, 10), LocalDate.of(2022, 05, 20),"Indapur" , "Hr", 50000.0));
			list.add(new Employee("Ajit",LocalDate.of(1988, 12, 12),LocalDate.of(2012, 03, 21), LocalDate.of(2022,01 , 11),"Purandar" , "Acounting", 33000.0));
			list.add(new Employee("prakash",LocalDate.of(1995, 06, 11),LocalDate.of(2015, 01, 01), LocalDate.of(2021, 01, 11),"pune" , "Testing", 36000.0));
			list.add(new Employee("vishal",LocalDate.of(1998, 05, 20),LocalDate.of(2020, 9, 05), LocalDate.of(2021, 10, 01),"Ratnagiri" , "Hr", 42000.0));

			// Employee In Particular Department
		System.out.println("Employee Name With Particular Department:");
			Map<String,List<Employee>> empdep=list.stream().collect(Collectors.groupingBy(Employee::getDepaerment));
			Set <Entry <String,List<Employee>>> entryset=empdep.entrySet();
			for (Entry <String,List<Employee>> entry:entryset) {
				System.out.println("Employees in "+entry.getKey()+" : ");
				List<Employee> list1=entry.getValue();
				for (Employee e:list1) {
					System.out.println(e.getName());
					
				}
				
			}
			//Employee With Highest Salary
			System.out.println("***********************************************************************");
			System.out.println("Employee With Highest Salary:");
			Map<String,Optional<Employee>> maxsalary=list.stream().collect(Collectors.groupingBy(Employee::getDepaerment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
			maxsalary.entrySet().forEach(System.out::println);
			
			//Employee With Minimum Salary
			System.out.println("***********************************************************************");
		    System.out.println("Employee With Minimum Salary:");
			Map<String,Optional<Employee>> minsalary=list.stream().collect(Collectors.groupingBy(Employee::getDepaerment,Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));
			minsalary.entrySet().forEach(System.out::println);
			
			//Average Salary Of Each Department
			System.out.println("***********************************************************************");
              System.out.println("Average Salary Of Each Departmeent:");
			Map<String, Double> avgSalaryDep=list.stream().collect(Collectors.groupingBy(Employee::getDepaerment, Collectors.averagingDouble(Employee::getSalary)));
			Set<Entry<String, Double>>entryset1=avgSalaryDep.entrySet();
			for(Entry<String, Double> entry:entryset1 ) {
				System.out.println(entry.getKey()+":"+entry.getValue());
				
			}
			
			//Number of employee in each Department
			System.out.println("***********************************************************************");
			System.out.println("Number Of Employee In Each Department:");
			Map<String,Long> numberOfEmp=list.stream().collect(Collectors.groupingBy(Employee::getDepaerment,Collectors.counting()));
			System.out.println(numberOfEmp);
			


		}
	

		
		
		
	}


