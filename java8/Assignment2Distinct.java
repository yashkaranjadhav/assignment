package Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment2Distinct {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(35,45,75,78,75);
		
		
		List<Integer> list1=list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(list1);
		
	}

}
