package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();
		int sum = 0;
		
		if( inputNumber%2 == 0){
			for(int i = 0 ; i <= inputNumber ; i+=2){
				sum = sum + i;
			}
		}else{
			for(int i = 1 ; i <= inputNumber ; i+=2){
				sum = sum + i;
			}
		}

		System.out.println("결과값 : "+sum);
		
		scanner.close();
	}

}
