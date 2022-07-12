package CodePackage;

public class Assignment8 {
	public static int count(int arr[]) {
		
int even_count=0;
	int odd_count=0;
	
	for(int i=0;i<arr.length;i++) {
		
		if(( arr[i] & 1)==1)
			odd_count++;
		else
			even_count++;
		
		
	}
	System.out.println("even count"+even_count);
	return even_count;
	

}
}
