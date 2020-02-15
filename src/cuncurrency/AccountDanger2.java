package cuncurrency;

public class  AccountDanger2 implements Runnable{
	private Account acct = new Account(); 
	
	public static void main(String[] args) {
		
		System.out.println("running-");
		AccountDanger2 r = new AccountDanger2(); 
		
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		
		one.setName("fred");
		two.setName("lucy");
		
		one.start();
		two.start();
	}

	@Override
	public void run() {		// TODO Auto-generated method stub
		System.out.println("-------------run--------"+Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			makewithdrawal(10);
			if (acct.getBalance() < 0) {
				System.out.println("account is over-drawn!***************");				
			}			
		}		
	}

	private synchronized void makewithdrawal(int amt) {
		// TODO Auto-generated method stub
		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName()+" thread "					
					+ "is going to ...withdraw the money");				
			
		try {
			Thread.sleep(500);
		}catch(InterruptedException e){}
		
		acct.withdraw(amt);		
		
		System.out.println(Thread.currentThread().getName()+" thread "					
					+ "completes the transaction");				
			
		
		} else {
			System.out.println(Thread.currentThread().getName()+" thread "					
					+ "Not enough money in account");
		}
		
	}
}
