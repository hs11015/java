package comu_java_10;

import java.util.Scanner;


public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Calculators calculator = new Calculators();
		
		System.out.print("첫 번쨰 숫자를 입력하세요 : ");
		int a = scan.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int b = scan.nextInt();
		
		calculator.x = a;
		calculator.y = b;

		calculator.printResult();

		scan.close();
	}

}


class Calculators {
	int x;
	int y;
	
	public void printResult() {
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
		System.out.printf("%d / %d = %d\n", x, y, x/y);
	}
}
