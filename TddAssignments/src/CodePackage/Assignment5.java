package CodePackage;

public class Assignment5 {
	public static boolean pythagoras(int a,int b,int c) {
		
		if(a*a==b*b+c*c) {
			System.out.println("pythagoras therom satisfying:"+a+""+b+""+c);
			return true;
		}
		else
			System.out.println("pythagoras therom notsatisfying:"+a+""+b+""+c);
		return false;
		
	}

	
	
}
