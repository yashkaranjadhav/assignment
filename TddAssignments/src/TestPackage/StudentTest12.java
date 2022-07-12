package TestPackage;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import CodePackage.Student;

class StudentTest12 {

	@Test
	void test() throws CloneNotSupportedException {
		Student s=new Student(1,"karan");
		Student s1=(Student)s.clone();
		assertEquals(true,Student.checkClone(s, s1));
	}

	
	}


