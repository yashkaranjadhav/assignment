package Assignment5;

import java.util.List;

public class StreamMaximum {
	
	List<Integer> numbers;

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
	
	
	public void show()
	{
		numbers.stream().forEach(System.out::println);
		
	}

	public void maxNum()
	{
		int num=numbers.stream().max((a,b)->a>b?1:-1).get();
		System.out.println("maximum number is : "+num);
	}
}


