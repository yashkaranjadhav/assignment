package Assignments;

import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Assignment8EvenOdd {
	
public static void main(String[] args) {
	
		IntPredicate isodd= argument -> argument%2==1;
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter value");
		int a=sc1.nextInt();
		System.out.println(isodd.test(a));
		
		IntStream stream=IntStream.range(1, 10);
		
		List<Integer> oddnumbers=stream.filter(isodd).boxed().collect(Collectors.toList());
	System.out.println(oddnumbers);
	IntPredicate iseven=argument->argument%2==0;
	System.out.println(iseven.test(a));
	
	IntStream stream1=IntStream.range(1, 10);
	List<Integer> evennumbers=stream1.filter(iseven).boxed().collect(Collectors.toList());
	
	System.out.println(evennumbers);
	
	
	
	
	
}

}
