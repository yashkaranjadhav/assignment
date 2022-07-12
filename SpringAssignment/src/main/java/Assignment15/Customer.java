package Assignment15;

public class Customer {
	
	String cname;
	String address;
	category objcat;

	public Customer(String cname, String address, category objcat) {
		super();
		this.cname = cname;
		this.address = address;
		this.objcat = objcat;
	}


	public Customer() {
		
	}


	public void showcdetails()
	{
		System.out.println("customer name:-"+cname);
		System.out.println("address:-"+address);
		objcat.showdetail();
	}

	}

	


