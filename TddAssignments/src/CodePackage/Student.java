package CodePackage;

public class Student {
	
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public static boolean checkClone(Student s,Student s1) {
		if(s.id==s1.id && s.name==s1.name)
			return true;
		else
			return false;
	}
	
	

}
