package comu_java_4;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("<���ݺ��� �ڱ�Ұ� ����!>");
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scan.next();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();	// ���� �Է��� ���� nextInt
		
		System.out.print("���л��� ���� �� �� �Ǽ̳���?(�� ���̸� 0.5) : ");
		float year = scan.nextFloat();	// �Ǽ� �Է��� ���� nextFloat

		System.out.print("MBTI�� �����ΰ���? : ");
		String mbti = scan.next();
		
		System.out.print("���� �������� ���� ���α׷��� �����ΰ���? : ");
		scan.nextLine();	// ���� �޼ҵ忡�� �Ѿ�� ���� ģ enterŰ�� �νĵ��� �ʰ� ��
		String coding = scan.nextLine();	// ���� �Է��� ���� nextLine
		
		System.out.println("\n���ݱ��� �Է¹��� ���� �����غ��ڽ��ϴ�.");
		System.out.printf("�� �̸��� %s, ���̴� %d��, ���л��� ������ %.1f�� �ƽ��ϴ�.\n", name, age, year);	// �ܾ� �����ڴ� %s
		System.out.printf("���� mbti�� %s�̰�, ���� �������� ���� ���α׷��� '%s'�Դϴ�.", mbti, coding);		// ���� �����ڴ� '%s"
		
		scan.close();
	}

}
