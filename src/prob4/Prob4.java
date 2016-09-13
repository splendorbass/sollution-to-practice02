package prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액: ");
		int haveMoney = scanner.nextInt();
		int count = 0;
		
		for(int i = 0 ; i < money.length ; i++){
			count = haveMoney/money[i];
			System.out.println(money[i]+"원: "+ count+"개");
			haveMoney = haveMoney - ( money[i] * count );
		}
		scanner.close();
		
	}
}

