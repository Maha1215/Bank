package bank;

import java.util.Random;

public class Maha {

	public static void main(String[] args) {
		Random me = new Random();
		int number;
		
		for(int counter=1;counter<=6;counter++) {
			number=1+me.nextInt(3);
			System.out.println(number);
		}
		
		

	}

}
