package comu_java_6;

import java.util.Scanner;

public class operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� 2���� ����� �����Ͽ� �Է��ϼ��� : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.printf("%d > %d �� %b\n", a, b, a > b); // a�� b���� ũ��
		System.out.printf("%d >= %d �� %b\n", a, b, a >= b); // a�� b���� ũ�ų� ����
		System.out.printf("%d < %d �� %b\n", a, b, !(a > b)); // a�� b���� �۰ų� ����
		System.out.printf("%d <= %d �� %b\n", a, b, !(a >= b)); // a�� b���� �۴�
		System.out.printf("%d == %d �� %b\n", a, b, a == b); // a�� b�� ����
		System.out.printf("%d != %d �� %b\n", a, b, a != b); // a�� b�� �ٸ���
		
		System.out.print("�� �߿� ū ����: ");
		System.out.println(a > b ? a : (a==b ? "����" : b));
		// a > b�� TRUE��� a ��� | FALSE��� a==b ���� ����, TRUE��� ����, FALSE��� b ���
		
		scan.close();	// Scanner �ݱ�
	}

}
