package oop1Lab4;

public class ContactTest {

	public static void main(String[] args) {
		Contact c1 = new Contact();
		c1.setPersonName("Rashma");
		c1.setPersonId("17-34");
		c1.setAge(24);
		c1.setMobileNumber("017-91873197");
		c1.setGender('F');
		c1.detectMobileOperator();
		c1.showinfo();
		
		Contact c2 = new Contact("John","18-34",24,"018-91873197",'M');
		c2.detectMobileOperator();
		c2.showinfo();
		

	}

}
