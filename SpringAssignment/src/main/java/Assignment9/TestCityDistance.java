package Assignment9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCityDistance {
	
	public static void main(String[] args) {
		List<CityDistance> clist = new ArrayList<CityDistance>();
		Scanner sc = new Scanner(System.in);
		
		ApplicationContext contex = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		
		CityDistance ct1 = (CityDistance) contex.getBean("cty");
		CityDistance ct2 = (CityDistance) contex.getBean("cty1");
		CityDistance ct3 = (CityDistance) contex.getBean("cty2");
		CityDistance ct4 = (CityDistance) contex.getBean("cty3");

		clist.add(ct1);
		clist.add(ct2);
		clist.add(ct3);
		clist.add(ct4);

		System.out.println("enter from city name");
		String fromCity1 = sc.next();

		System.out.println("enter to city name");
		String toCity1 = sc.next();

		List<CityDistance> matchedList = clist.stream().filter(c -> c.getFromCity().equalsIgnoreCase(fromCity1))
				.filter(c -> c.getToCity().equalsIgnoreCase(toCity1)).collect(Collectors.toList());

		if (!matchedList.isEmpty()) {
			for (CityDistance cities : matchedList) {
				System.out.print("distance between "+cities.getFromCity() +" & "+cities.getToCity()+" is "+cities.getDistance() + " Km");

			}
		} else
			System.out.println("data not available");
	}
}

	
	
	
	


