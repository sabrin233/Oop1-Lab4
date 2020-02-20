package oop1Lab4;

public class Account {
	
		private String accName;
		private String acId;
		private int balance;
		
		int deposite;
		int withdraw;

		public Account() {
			super();
		}
		
	     public Account(String accName, String acId, int balance) {
			super();
			this.accName = accName;
			this.acId = acId;
			this.balance = balance;
		}



		public void deposit(int amount)
		{
			balance = balance + amount;
			System.out.println("Enter Amount U Want to Deposit : ");
		}

		public void withdraw(int amount)
		{
			
			if(balance>=amount) {
				balance = balance - amount;
				System.out.println("Enter Amount U Want to withdraw : ");
				
			}
			else {
				System.out.println("Less balance");
				
			}
				
		}

		public int getBalance()
		{
			return balance;
		}

		@Override
		public String toString() {
			return "Account [accName=" + accName + ", acId=" + acId + ", balance=" + balance + ", deposite=" + deposite
					+ ", withdraw=" + withdraw + "]";
		}
		public void showinfo() {
			System.out.println(accName + " " + acId +" "+balance+" "+deposite+" "+withdraw);
		}
		       
		       
		       
		       

		}
	


