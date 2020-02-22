package oop1Lab4;

public class AccountTest {
	
	public static void main(String[] args){
		Account a1 = new Account("Bank","17-34",10000);
		a1.withdraw(1000);
		a1.deposit(5000);
		System.out.println(a1);
		


	}

}
