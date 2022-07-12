package Assignment13;

public class movie12_3 implements Movie{
	
	@Override
	public void moviename() {
	System.out.println("movie name:-"+"Sultan");
		
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
