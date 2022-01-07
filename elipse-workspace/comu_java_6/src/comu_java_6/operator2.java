package comu_java_6;

import java.util.Scanner;

public class operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 2개를 띄어쓰기로 구분하여 입력하세요 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.printf("%d > %d 는 %b\n", a, b, a > b); // a가 b보다 크다
		System.out.printf("%d >= %d 는 %b\n", a, b, a >= b); // a가 b보다 크거나 같다
		System.out.printf("%d < %d 는 %b\n", a, b, !(a > b)); // a가 b보다 작거나 같다
		System.out.printf("%d <= %d 는 %b\n", a, b, !(a >= b)); // a가 b보다 작다
		System.out.printf("%d == %d 는 %b\n", a, b, a == b); // a와 b가 같다
		System.out.printf("%d != %d 는 %b\n", a, b, a != b); // a와 b가 다르다
		
		System.out.print("둘 중에 큰 수는: ");
		System.out.println(a > b ? a : (a==b ? "같음" : b));
		// a > b가 TRUE라면 a 출력 | FALSE라면 a==b 조건 실행, TRUE라면 같음, FALSE라면 b 출력
		
		scan.close();	// Scanner 닫기
	}

}
