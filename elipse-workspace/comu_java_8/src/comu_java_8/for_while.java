package comu_java_8;

import java.util.Scanner;

public class for_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int number = scan.nextInt();
		int sum1 = 0;
		
		for (int i=1; i<number+1; i++) {
			sum1 += i;
		}
		System.out.printf("     [for문] 1부터 %d까지의 합은 %d입니다.", number, sum1);
		
		int j = 1;
		int sum2 = 0;
		while (j<number+1) {
			sum2 += j;
			j++;
		}
		System.out.printf("\n   [while문] 1부터 %d까지의 합은 %d입니다.", number, sum2);
		
		int k = 1;
		int sum3 = 0;
		do {
			sum3 += k;
			k++;
		} while (k<=number);
		System.out.printf("\n[do while문] 1부터 %d까지의 합은 %d입니다.", number, sum3);
		
		scan.close();
	}

}
