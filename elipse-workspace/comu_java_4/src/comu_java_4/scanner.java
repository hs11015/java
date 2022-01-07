package comu_java_4;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("<지금부터 자기소개 시작!>");
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();	// 정수 입력할 때는 nextInt
		
		System.out.print("대학생이 된지 몇 년 되셨나요?(반 년이면 0.5) : ");
		float year = scan.nextFloat();	// 실수 입력할 때는 nextFloat

		System.out.print("MBTI가 무엇인가요? : ");
		String mbti = scan.next();
		
		System.out.print("현재 참여중인 모각코 프로그램은 무엇인가요? : ");
		scan.nextLine();	// 이전 메소드에서 넘어가기 위해 친 enter키가 인식되지 않게 함
		String coding = scan.nextLine();	// 문장 입력할 때는 nextLine
		
		System.out.println("\n지금까지 입력받은 것을 나열해보겠습니다.");
		System.out.printf("제 이름은 %s, 나이는 %d세, 대학생이 된지는 %.1f년 됐습니다.\n", name, age, year);	// 단어 지시자는 %s
		System.out.printf("저의 mbti는 %s이고, 현재 참여중인 모각코 프로그램은 '%s'입니다.", mbti, coding);		// 문장 지시자는 '%s"
		
		scan.close();
	}

}
