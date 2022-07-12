package Assignment3;

import java.util.Scanner;

public class Emi {
	
	int amount;
	int irate;
	int no_of_Emi;
	int Emi;
	int year;
	public int getAmount() {
		return amount;
	}

public void setAmount(int amount) {
		this.amount = amount;
	}
public int getIrate() {
		return irate;
	}

public void setIrate(int irate) {
		this.irate = irate;
	}

public int getNo_of_Emi() {
		return no_of_Emi;
	}

public void setNo_of_Emi(int no_of_Emi) {
		this.no_of_Emi = no_of_Emi;
	}
public int getEmi() {
		return Emi;
	}

public void setEmi(int emi) {
		Emi = emi;
	}

public int getYear() {
		return year;
	}



public void setYear(int year) {
		this.year = year;
	}


public Emi(int irate) {
	
	this.irate = irate;
}

public Emi() {

}Scanner sc=new Scanner(System.in);
	public void dispaly() {
		System.out.println("Enter Amount");
		amount=sc.nextInt();
		System.out.println("EMI");
		Emi=sc.nextInt();
		System.out.println("Enter year");
		year=sc.nextInt();
		this.no_of_Emi=(amount+(amount*irate*year)/100)/Emi;
		System.out.println("no of emi:"+no_of_Emi);
	}
	

}
