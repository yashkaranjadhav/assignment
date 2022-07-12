package Assignment13;

public class movie9_12 implements Movie {
	
	@Override
	public void moviename() {
		System.out.println("movie name:-"+"Jersey");
		
	}

	@Override
	public void price(int a) {
	System.out.println("ticket price:-"+a);
		
	}

	@Override
	public void collection(int a, int b) {
	System.out.println("weekly collection:-"+a*b*7);
		
	}

}
