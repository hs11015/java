package comu_java_5;

import java.util.Scanner;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			
		System.out.print("첫 번째 숫자(정수)를 입력하세요: " );
		int x = scan.nextInt();
			
		System.out.print("두 번째 숫자(정수)를 입력하세요: " );
		int y = scan.nextInt();

		System.out.println("========입력된 숫자========");
		System.out.print("입력받은 첫 번째 정수는 ");
		System.out.println(+x);
		
		System.out.print("입력받은 두 번째 정수는 ");
		System.out.println(+y);

		System.out.println("========부호 바꾸기========");
		System.out.print("입력받은 첫 번째 정수는 ");
		System.out.println(-x);

		System.out.print("입력받은 두 번째 정수는 ");
		System.out.println(-y);
		
		System.out.println("========자동 계산기========");
			
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
		System.out.printf("%d / %d = %d\n", x, y, x/y);
		System.out.printf("%d %% %d = %d\n", x, y, x%y);
		System.out.printf("%d를 전위 증감 연산자를 이용해 1 증가시키면 %d\n", x, ++x);
		System.out.printf("%d를 후위 증감 연산자를 이용해 1 감소시키면 %d\n", y, y--);
		System.out.println("어라 후위 증감 연산자를 사용하면 그대로잖아?!");
		System.out.print("후위 증감 연산자는 먼저 출력하고 계산하니 다시 한 번! : ");
		System.out.print(y);
		
		scan.close();
	}

}
