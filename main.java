package day0913;

import java.util.Scanner;

public class ForExample1 {

	public static void main(String[] args) {

		// 숫자를 입력받아서 1부터 해당 숫자까지의
		// 짝수합 : ###
		// 홀수합 : ###
		// 총 합계 : ###
		
		int num=0;
		int eSum=0, oSum=0, tSum=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 >");
		num = scan.nextInt();
		
		for (int i =1; i<=num; i++) {
			if (i % 2 == 0) {
				eSum += i;
			} else {
				oSum += i;
			} 
			tSum += i;
		}
		System.out.printf("짝수 합계 : %,d\n", + eSum);
		System.out.printf("홀수 합계 : %,d\n", + oSum);
		System.out.printf("총 합계 : %,d\n", + tSum);
		
		
	
	}

}
