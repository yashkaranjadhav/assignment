package Assignment15;

public class category {

	String cat;
	String color;
	Item objitem;
	
	public category(String cat, String color, Item objitem) {
		
		this.cat = cat;
		this.color = color;
		this.objitem = objitem;
	}

	public category() {
	
	}
	public void showdetail()
	{
		System.out.println("category:-"+cat);
		System.out.println("color:-"+color);
		objitem.show();
	}
	

	
	
	
	
	
	
	
	
}
