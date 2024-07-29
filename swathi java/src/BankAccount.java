

	public class BankAccount {
        String accountNumber = "12345678";
        int balance = 20000;
        
        public int Deposit(int amount1)
        {
       	 balance = balance + amount1;
       	 return balance;
        }
        
        public int Withdraw(int amount2) {
       	 balance = balance - amount2;
       	 return balance;
       	 
        }
        public static void main(String[] args) {
       	 BankAccount acc = new BankAccount();
       	  
       	 System.out.println("After deposit current balance is : " + acc.Deposit(10000));
       	 System.out.println("After withdraw current balance is :" + acc.Withdraw(5000));
        }
}

