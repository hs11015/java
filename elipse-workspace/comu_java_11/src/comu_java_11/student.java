package comu_java_11;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name1 = scan.next();
		
		System.out.print("1��° ������ �Է��ϼ��� : ");
		int name1_score1 = scan.nextInt();
		
		System.out.print("2��° ������ �Է��ϼ��� : ");
		int name1_score2 = scan.nextInt();
		
		System.out.print("3��° ������ �Է��ϼ��� : ");
		int name1_score3 = scan.nextInt();
		
		System.out.print("�� ���� �̸��� �Է��ϼ��� : ");
		String name2 = scan.next();
		
		System.out.print("1��° ������ �Է��ϼ��� : ");
		int name2_score1 = scan.nextInt();
		
		System.out.print("2��° ������ �Է��ϼ��� : ");
		int name2_score2 = scan.nextInt();
		
		System.out.print("3��° ������ �Է��ϼ��� : ");
		int name2_score3 = scan.nextInt();
		
		
		Students student1 = new Students(name1, name1_score1, name1_score2, name1_score3);
		Students student2 = new Students(name2, name2_score1, name2_score2, name2_score3);
		
		student1.getAverage();
		student2.getAverage();
		
		scan.close();
	}

}


class Students{
	
	String str;
	int a,b,c;
	
	public Students(String str, int a, int b, int c)
	{
		this.str=str;
		this.a=a;
		this.b=b;
		this.c=c;
		
		System.out.println(str + "�� ��� ���� : " + (float)(a+b+c)/3);
	}
	
	public float getAverage()
	{
		return (float)(a+b+c)/3;
	}
}