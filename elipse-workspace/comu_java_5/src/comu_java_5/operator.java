package comu_java_5;

import java.util.Scanner;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			
		System.out.print("ù ��° ����(����)�� �Է��ϼ���: " );
		int x = scan.nextInt();
			
		System.out.print("�� ��° ����(����)�� �Է��ϼ���: " );
		int y = scan.nextInt();

		System.out.println("========�Էµ� ����========");
		System.out.print("�Է¹��� ù ��° ������ ");
		System.out.println(+x);
		
		System.out.print("�Է¹��� �� ��° ������ ");
		System.out.println(+y);

		System.out.println("========��ȣ �ٲٱ�========");
		System.out.print("�Է¹��� ù ��° ������ ");
		System.out.println(-x);

		System.out.print("�Է¹��� �� ��° ������ ");
		System.out.println(-y);
		
		System.out.println("========�ڵ� ����========");
			
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
		System.out.printf("%d / %d = %d\n", x, y, x/y);
		System.out.printf("%d %% %d = %d\n", x, y, x%y);
		System.out.printf("%d�� ���� ���� �����ڸ� �̿��� 1 ������Ű�� %d\n", x, ++x);
		System.out.printf("%d�� ���� ���� �����ڸ� �̿��� 1 ���ҽ�Ű�� %d\n", y, y--);
		System.out.println("��� ���� ���� �����ڸ� ����ϸ� �״���ݾ�?!");
		System.out.print("���� ���� �����ڴ� ���� ����ϰ� ����ϴ� �ٽ� �� ��! : ");
		System.out.print(y);
		
		scan.close();
	}

}
