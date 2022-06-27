package Assignments;

import java.util.function.Predicate;

public class Assignment9Evenodd {
	
	public static void main(String[] args) {
		
		
		Predicate<Integer> p1= i -> i % 2 == 0;
		
		int numbers[]= {75,14,63,55,53};
		
		for(int num: numbers) {
			
			if(p1.test(num)) {
				System.out.println(num+"\t even");
			}
		}
		
		Predicate<Integer> p2= i -> i%2==1;
		for(int num:numbers) {
			if(p2.test(num)) {
				System.out.println(num+"\t odd");
			}
		}
	}

}
