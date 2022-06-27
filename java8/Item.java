package Assignments;

import java.time.LocalDate;

public class Item {
  String iname;
	String category;
	Float price ;
	LocalDate dom;
	LocalDate doe;
	public Item(String iname, String category, float price, LocalDate dom, LocalDate doe) {
		super();
		this.iname = iname;
		this.category = category;
		this.price = price;
		this.dom = dom;
		this.doe = doe;
	}

}
