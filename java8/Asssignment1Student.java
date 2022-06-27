package Assignments;
import java.util.*; 
import java.util.Scanner;
public class Asssignment1Student {
	
   public static void main(String args[])   
{  
	   Scanner sc1=new Scanner(System.in);
int sum = 0, avg;      
System.out.println("Enter the  maths mark");
int mark=sc1.nextInt();
System.out.println("enter the physics mark");
int mark1=sc1.nextInt();
System.out.println("Enter the Chemistry mark");
int mark2=sc1.nextInt();
System.out.println("enter the English mark");
int mark3=sc1.nextInt();
System.out.println("enter the InformationTechnology mark");
int mark4=sc1.nextInt();
ArrayList<Integer> list = new ArrayList<Integer>(); 
Set<Integer> distinct = new HashSet<Integer>(list);
list.add(mark);
list.add(mark1);
list.add(mark2);
list.add(mark3);
list.add(mark4);


for(int i = 0; i < list.size(); i++)  

sum = sum + list.get(i);  
avg = sum / list.size();   

System.out.println("The Average Of mark is " + avg);  
System.out.println("Distinct mark  count: " + distinct.size());

}  
}  


/*****************************/

/*
List<String> gasList = // create list with duplicates...
Set<String> uniqueGas = new HashSet<String>(gasList);
System.out.println("Unique gas count: " + uniqueGas.size());
*/
















