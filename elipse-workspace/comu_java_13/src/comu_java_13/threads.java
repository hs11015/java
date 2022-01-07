package comu_java_13;

import java.util.Scanner;

//Thread Ŭ������ ����� NumberThread Ŭ���� ����
class NumberThread extends Thread { 
	public void run() { // start �޼ҵ�� ȣ��
		// 0 ���� 49���� ���
		for (int i = 0; i < 50; i++) {
			System.out.print(i);
		}
	}
}

//Thread Ŭ������ ����� SmallCharThread Ŭ���� ����
class SmallCharThread extends Thread {
	public void run() { // start �޼ҵ�� ȣ��
		// a���� z���� ���
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
	} 
}

//Thread Ŭ������ ����� LargeCharThread Ŭ���� ����
class LargeCharThread extends Thread {
	public void run() { // start �޼ҵ�� ȣ��
		// a���� z���� ���
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
	} 
}

public class threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NumberThread Ŭ���� �ν��Ͻ� ����
		Thread thread_num = new NumberThread();
		// SmallCharThread Ŭ���� �ν��Ͻ� ����
		Thread thread_small = new SmallCharThread();
		// LargeCharThread Ŭ���� �ν��Ͻ� ����
		Thread thread_large = new LargeCharThread();
				
		Scanner scan = new Scanner(System.in);

		int num = 0;
		
		System.out.println("����ϰ� ���� Thread�� �ش��ϴ� ���ڸ� �Է����ּ���.");
		System.out.println("���� : 1, �ҹ��� : 2, �빮�� : 3");
		System.out.print("�Է��Ͻ� ���� : ");
		num = scan.nextInt();
			
		if (num == 1) {
			System.out.printf("%d�� �Է��ϼ̽��ϴ�.\n", num);
			System.out.println("���� �ش��ϴ� Thread�� �Ʒ��� �����ϴ�.");
			thread_num.start(); // NumberThread ���� (run �޼ҵ� ȣ��)
		}

		if (num == 2) {
			System.out.printf("%d�� �Է��ϼ̽��ϴ�.\n", num);
			System.out.println("�ҹ��� �ش��ϴ� Thread�� �Ʒ��� �����ϴ�.");
			thread_small.start(); // SmallCharThread ���� (run �޼ҵ� ȣ��)
		}
			
		if (num == 3) {
			System.out.printf("%d�� �Է��ϼ̽��ϴ�.\n", num);
			System.out.println("�빮�� �ش��ϴ� Thread�� �Ʒ��� �����ϴ�.");
			thread_large.start(); // LargeCharThread ���� (run �޼ҵ� ȣ��)
		}
		
		scan.close();
	}
	
}


