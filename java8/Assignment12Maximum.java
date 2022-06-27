package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment12Maximum {
	
	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<Integer>();
		
	Maximum m=(int arr[]) ->{
			for (int i=1;i<arr.length;i++) {
				list.add(arr[i]);
			}
	Integer a=list.stream().max((e1 ,e2)->e1>e2?1:-1).get();
			System.out.println("Maximum Number in Array:"+a);
		};
		m.maxArr(new int[] {68,87,89,123,456,789});
	}
}



