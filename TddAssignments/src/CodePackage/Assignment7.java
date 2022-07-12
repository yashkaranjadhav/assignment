package CodePackage;

public class Assignment7 {
	public static int reversenumber(int n) {
		int rev_no=0;
		while(n>0) {
			rev_no=rev_no*10+n%10;
			n=n/10;
		}
		return rev_no;
	}

}
