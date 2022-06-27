package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment7MainClass {
	public static void main(String[]args) {
		List<Assignment7Evenprice> evenprice= new ArrayList<Assignment7Evenprice>();
		
		evenprice.add(new Assignment7Evenprice(1,"pen",15f));
		evenprice.add(new Assignment7Evenprice(2,"pencil",10f));
		evenprice.add(new Assignment7Evenprice(3,"pant",600));
		evenprice.add(new Assignment7Evenprice(4,"shirt",700f));
		List<Float> eprice=evenprice.stream().filter(p->p.productprice%2==0).map(p->p.productprice).collect(Collectors.toList());
		System.out.println(eprice);
	}
	

}
