package comu_java_9;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int length = 5;
		int[] arr = new int[length];
				
		System.out.println("숫자 5개를 입력하세요(띄어쓰기 구분): ");
		for(int i=0;i<length;i++) {
			arr[i] = scan.nextInt();
		}
				
		System.out.println("======= 입력 완료 =======");
		System.out.println("======= 출력 시작 =======");
		
		for(int j=length-1;j>=0;j--) {
			System.out.printf("%d번쨰 입력 숫자: ", j+1);
			System.out.printf("%d\n",arr[j]);
		}
		
		scan.close();
	}

}
