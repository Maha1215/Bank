package bank;

public class She {

	public static void main(String[] args) {
		int firstarray[][]= {{8,9,7},{3,2,1}};
		int secondarray[][]= {{45,32,69},{89,25},{55,78,39,81,46}};
	     
		System.out.println("this is the first array");
		me(firstarray);
		System.out.println("this is the second array");
		me(secondarray);
	}
	
	
	public static void me(int x[][]) {
		for(int row=0;row<x.length;row++) {
			for(int column=0;column<x[row].length;column++) {
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}

	}

}
