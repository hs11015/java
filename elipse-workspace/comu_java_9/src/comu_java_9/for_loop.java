package comu_java_9;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int length = 5;
		int[] arr = new int[length];
				
		System.out.println("���� 5���� �Է��ϼ���(���� ����): ");
		for(int i=0;i<length;i++) {
			arr[i] = scan.nextInt();
		}
				
		System.out.println("======= �Է� �Ϸ� =======");
		System.out.println("======= ��� ���� =======");
		
		for(int j=length-1;j>=0;j--) {
			System.out.printf("%d���� �Է� ����: ", j+1);
			System.out.printf("%d\n",arr[j]);
		}
		
		scan.close();
	}

}
