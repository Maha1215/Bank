package bank;

import java.util.Random;

public class He {

	public static void main(String[] args) {
		Random me=new Random();
		int you[]=new int[4];
		for(int roll=1;roll<100;roll++) {
			++you[1+me.nextInt(3)];
		}
			System.out.println("Face\tBack");
			
			for(int she=1;she<you.length;she++) {
				System.out.println(she+"\t"+you[she]);
			
		}

	}

}
