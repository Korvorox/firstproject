package entities;

public class Account {
		private int number;
		private String holder;
		private double balance;
		
		
		//construtor de dois argumentos.
		
		public Account(int number, String holder) {
			this.number = number;
			this.holder = holder;
		}
		//construtor de três argumentos.
		//atenção a deposito inicial, muda regra, caso efetuar troca de deposito, alterar na formula abaixo do deposito

		public Account(int number, String holder, double initialDeposit) {
			this.number = number;
			this.holder = holder;
			deposit(initialDeposit);
		}

		//criação de getset dos contrutores
		public int getNumber() {
			return number;
		}


		public String getHolder() {
			return holder;
		}


		public void setHolder(String holder) {
			this.holder = holder;
		}

		public double getBalance() {
			return balance;
		}
		//comandos pra deposito e saque
		public void deposit(double amount) {
			balance += amount;
		}
		public void withdraw(double amount ) {
			balance -= amount + 5.0;
		}
		
		public String toString() {
			return "Account "
					+ number
					+ ", Holder: "
					+ holder
					+ ", Balance: $ "
					+ String.format("%.2f", balance);
			
		}
	
		
		
		
		
}
