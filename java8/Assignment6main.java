package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment6main {
	
public static void main(String[] args) {
	List<Assignment6Item> ilist=new ArrayList<Assignment6Item>();
	ilist.add(new Assignment6Item(1,"pen",20f));
	ilist.add(new Assignment6Item(2,"pencil",10f));
	ilist.add(new Assignment6Item(3,"pant",600f));
	ilist.add(new Assignment6Item(4,"shirt",400f));
	ilist.add(new Assignment6Item(5,"mobile",5000f));
	ilist.add(new Assignment6Item(6,"shoes",700f));
	
	double avgprice=ilist.stream().collect(Collectors.averagingDouble(s1->s1.itemprice));
	System.out.println("avg price:"+avgprice);
	List<Float> ilist1=ilist.stream().filter(p -> p.itemprice>=avgprice).map(p->p.itemprice).collect(Collectors.toList());
	
	System.out.println(ilist1);
}
}
