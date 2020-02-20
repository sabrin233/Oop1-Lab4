package oop1Lab4;

public class Student {

	private String id;
	private String name;
	private String Department;
	private float Cgpa;
	
	public Student() {
		super();
	}

	public Student(String id, String name, String department, float cgpa) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
		Cgpa = cgpa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public float getCgpa() {
		return Cgpa;
	}

	public void setCgpa(float cgpa) {
		Cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Department=" + Department + ", Cgpa=" + Cgpa + "]";
	}
	
	public void showinfo() {
		System.out.println(id + " " + name +" "+Department+" "+ Cgpa);
	}
	
	
	
	
	
}
