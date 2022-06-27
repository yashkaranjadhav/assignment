package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Assinment5Stringlength {
	public static void main(String[] args) {
		
String[] str= {"kiran","sanket"};
List<Integer> count=new ArrayList<Integer>();
for(String s:str) {
	int c=0;
	char[] arr=s.toCharArray();
	for(char ch:arr) {
		c++;
		
	}
	count.add(c);
	
}
System.out.println(count);
Integer strcount=count.stream().max((o1,o2)->o1.intValue() >o2.intValue()?1:-1).get();
System.out.println("maximum length of String"+count);
		
	}
	

}
