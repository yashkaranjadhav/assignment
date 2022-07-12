package Assignment2;

import java.util.List;
import java.util.stream.Collectors;

public class AverageNum2 {
	
	List<Integer> num;

	public List<Integer> getNum() {
		return num;
	}

	public void setNum(List<Integer> num) {
		this.num = num;
	}
	public void show()
	{
		double avg1=num.stream().collect(Collectors.averagingDouble(i->i));
		System.out.println("Average of numbers : "+avg1);
		
	}
	
	
	

}
