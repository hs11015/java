package comu_java_12;

import java.util.Scanner;

public class range_error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] value = {0,1,2,3,4,5,6,7,8,9};
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ���: ");
			int i = scan.nextInt();
			
			try {
				System.out.println(value[i]);
				System.out.println("���α׷� ����");
				break;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0~9 ������ ���� �Է��ϼ���");
			}
		}
		
		
		scan.close();
	}

}