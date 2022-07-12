package CodePackage;

public class Assinment6 {
	public static int count(String str) {
		
		
		int vowel_count=0;
		char[] chars=str.toCharArray();
		for(char c :chars) {
			
			
			if(c=='a'|| c=='e' ||c=='i'||c=='o'||c=='u')
				vowel_count++;
		}
		
		return vowel_count;
	}

}
