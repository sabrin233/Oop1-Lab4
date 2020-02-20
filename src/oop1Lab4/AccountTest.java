package oop1Lab4;

public class AccountTest {
	
	String accName;;
	String acId;
	int balance;
	int deposite;
	int withdraw;
	
	public static void main(String[] args){
		Account a1 = new Account();
		a1.withdraw(250);
		a1.deposit(400);
		System.out.println(a1);
		


	}

}
