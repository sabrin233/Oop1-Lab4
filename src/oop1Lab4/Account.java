package oop1Lab4;

public class Account {
	
		private String accName;
		private String acId;
		private int balance;

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
		}

		public void withdraw(int amount)
		{
			balance = balance - amount;
		}

		public int getBalance()
		{
			return balance;
		}

		@Override
		public String toString() {
			return "Account [accName=" + accName + ", acId=" + acId + ", balance=" + balance + "]";
		}
		public void showinfo() {
			System.out.println(accName + " " + acId +" "+balance);
		}
		       
		       
		       
		       

		}
	


