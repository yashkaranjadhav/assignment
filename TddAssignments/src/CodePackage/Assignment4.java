package CodePackage;

public class Assignment4 {

		
		public static boolean Armstrong()
		{
			int no=153;
		int temp=no;
		
		int rem;
		int sum=0;
		
		while(temp!=0) {
			
			rem=temp%10;
			sum=sum+rem*rem*rem;
			temp=temp/10;
		
			}
		if(sum==no) {
			return true;
		}
		
		else
		{
			return false;
		}
			
		}
			
		public static void main(String[] args) {
			System.out.println(Assignment4.Armstrong());
			
		}
		
		
		
	}


