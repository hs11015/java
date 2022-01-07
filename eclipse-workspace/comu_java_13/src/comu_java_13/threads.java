package comu_java_13;

import java.util.Scanner;

//Thread 클래스를 상속한 NumberThread 클래스 생성
class NumberThread extends Thread { 
	public void run() { // start 메소드로 호출
		// 0 부터 49까지 출력
		for (int i = 0; i < 50; i++) {
			System.out.print(i);
		}
	}
}

//Thread 클래스를 상속한 SmallCharThread 클래스 생성
class SmallCharThread extends Thread {
	public void run() { // start 메소드로 호출
		// a부터 z까지 출력
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
	} 
}

//Thread 클래스를 상속한 LargeCharThread 클래스 생성
class LargeCharThread extends Thread {
	public void run() { // start 메소드로 호출
		// a부터 z까지 출력
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
	} 
}

public class threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NumberThread 클래스 인스턴스 생성
		Thread thread_num = new NumberThread();
		// SmallCharThread 클래스 인스턴스 생성
		Thread thread_small = new SmallCharThread();
		// LargeCharThread 클래스 인스턴스 생성
		Thread thread_large = new LargeCharThread();
				
		Scanner scan = new Scanner(System.in);

		int num = 0;
		
		System.out.println("출력하고 싶은 Thread에 해당하는 숫자를 입력해주세요.");
		System.out.println("숫자 : 1, 소문자 : 2, 대문자 : 3");
		System.out.print("입력하실 숫자 : ");
		num = scan.nextInt();
			
		if (num == 1) {
			System.out.printf("%d을 입력하셨습니다.\n", num);
			System.out.println("숫자 해당하는 Thread는 아래와 같습니다.");
			thread_num.start(); // NumberThread 시작 (run 메소드 호출)
		}

		if (num == 2) {
			System.out.printf("%d를 입력하셨습니다.\n", num);
			System.out.println("소문자 해당하는 Thread는 아래와 같습니다.");
			thread_small.start(); // SmallCharThread 시작 (run 메소드 호출)
		}
			
		if (num == 3) {
			System.out.printf("%d을 입력하셨습니다.\n", num);
			System.out.println("대문자 해당하는 Thread는 아래와 같습니다.");
			thread_large.start(); // LargeCharThread 시작 (run 메소드 호출)
		}
		
		scan.close();
	}
	
}


