package Assignments;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Assignment16main {
	
	public static void main(String[] args) {
		
		
		List<Item> list=new ArrayList<>();
		list.add(new Item("mobile","Electronics",25000,LocalDate.of(2022,02,13),LocalDate.of(2023, 02,12)));
		list.add(new Item("Tablet","Medicine",100,LocalDate.of(2022,06,21),LocalDate.of(2022, 07,21)));
		list.add(new Item("sprite","Softdrink",40,LocalDate.of(2022,06,21),null));
		
		
		System.out.println("Enter Catagory:");
		Scanner sc=new Scanner(System.in);
		String catagory=sc.next();
		List<Item> list1=list.stream().filter(e->e.category.equals(catagory)).collect(Collectors.toList());
		for (Item  item1:list1) {
			System.out.println("Item Name: "+item1.iname+"\t price:"+item1.price+" \t Date Of MAnufacturing:"+item1.dom+" \t Date OF Expiry:"+item1.doe);	
		}
		

		System.out.println("Enter the Staring letter of Item");
		String str=sc.next();
		List<Item> list2=list.stream().filter(e ->e.iname.startsWith(str.toLowerCase())).collect(Collectors.toList());
		
		for (Item  item3:list2) {
			System.out.println("Item Name: "+item3.iname+"\t category: "+item3.category+"\t price:"+item3.price+"\t Date Of MAnufacturing: "+item3.dom+"\t Date OF Expiry:"+item3.doe);	
		}
		
		
	}

}
