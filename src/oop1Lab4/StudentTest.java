package oop1Lab4;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setId("17-34472-2");
		s1.setName("Rashma");
		s1.setDepartment("CSE");
		s1.setCgpa(4);
		s1.showinfo();
		
		
		Student s2 = new Student("17-34452-2", "JOHN", "CSE", 4);
		s2.showinfo();
		
		

	}

}
