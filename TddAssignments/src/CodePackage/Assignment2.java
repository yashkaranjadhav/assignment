package CodePackage;

public class Assignment2 {
	static int max_char=28;
	public static String palindrome(String a, String b) {
		int[] counta=new int [max_char];
		int[] countb=new int [max_char];
		int l1=a.length();
		int l2=b.length();
		for(int i=0;i<l1;i++) 
			counta[a.charAt(i)-'a']++;
		
		for(int i=0;i<l2;i++) 
			counta[b.charAt(i)-'a']++;
			
			
		for(int i=0 ; i < 28 ;i++)
			if((counta[i] > 1 && countb[i]==0))
           return "palindrome";
           
           return "not palindrome";
		
		
	}		
	public static void main(String[] args) {
		String a="karan";
		String b="kiran";
		System.out.println(palindrome(a,b));
		
	}
	
	
	
	
	
	
	
		
		
	

}
