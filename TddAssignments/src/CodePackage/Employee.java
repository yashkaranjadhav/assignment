package CodePackage;

public class Employee implements Cloneable {
	int id;
	String name;
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}
	
	public static boolean checkclone(Employee e1,Employee e2) {
		
		if (e1.id==e2.id&& e1.name==e2.name)
			return true;
		else 
			return false;
	}

}
