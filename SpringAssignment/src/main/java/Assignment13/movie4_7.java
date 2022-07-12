package Assignment13;

public class movie4_7 implements Movie{
	
	@Override
	public void moviename() {
	System.out.println("movie name:-"+"Pavankhind");
		
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
