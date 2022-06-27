package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment3Employee {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("kiran");
		list.add("sanket");
		list.add("mayur");
		list.add("bhushan");
		list.add("akash");
		list.add("akash");
		
		List<String> emp=list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(emp);
	}

}
