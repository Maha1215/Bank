package bank;

public class Bank {

	public static void main(String[] args) {
		double amount;
		double principal=100;
		double rate=.01;
		
		for (int day=1; day<=5; day++) {
			amount=principal*Math.pow(1+rate, day);
			System.out.println(day+"  "+amount);
		}
	

	}

}
