package comu_java_7;

import java.util.Scanner;

public class conditional_sentence {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
					
		System.out.println("����� MBTI�� �ش��ϴ� ������ ������ �˷������!");
		System.out.print("�Ʒ��� MBTI�� �Է����ּ���! ");
		System.out.println("(��� �ҹ��� Ȥ�� �빮�ڷ� �Է��ؾ� �մϴ�)");
		String mbti = scan.next();
		int a = 1;

		while(a == 1) {
			
			switch (mbti) {		
			
			case "INTP", "intp" : {
				System.out.println("INTP - �鿣����");
				a = 0;
			}
			break;
			
			case "ENFJ", "enfj" : {
				System.out.println("ENFJ - ����Ʈ������");
				
			}
			break;
			
			case "INFJ", "infj" : {
				System.out.println("INFJ - Ǯ������");					
				a = 0;
			}
			break;
			
			case "ISTJ", "istj" : {
				System.out.println("ISTJ - �ۺ�����");
				a = 0;
			}
			break;

			case "ENTJ", "entj" : {
				System.out.println("ENTJ - ��Ű������");
				a = 0;
			}
			break;
			
			case "ISFJ", "isfj" : {
				System.out.println("ISFJ - ������������");
				a = 0;
			}
			break;
			
			case "INTJ", "intj" : {
				System.out.println("INTJ - �����ͺм�����");
				a = 0;
			}
			break;
			
			case "ENFP", "enfp" : {
				System.out.println("ENFP - AI��");
				a = 0;
			}
			break;
			
			case "ENTP", "entp" : {
				System.out.println("ENTP - iOS��");
				a = 0;
			}
			break;
			
			case "ESFJ", "esfj" : {
				System.out.println("ESFJ - �ȵ���̵���");
				a = 0;
			}
			break;
			
			case "ESFP", "esfp" : {
				System.out.println("ESFP - ���� ��������");
				a = 0;
			}
			break;
			
			case "ESTP", "estp" : {
				System.out.println("ESTP - IoT ������");
				a = 0;
			}
			break;
			
			case "ESTJ", "estj" : {
				System.out.println("ESTJ - QA ��");
				a = 0;
			}
			break;
			
			case "INFP", "infp" : {
				System.out.println("INFP - ���ü����");
				a = 0;
			}
			break;
			
			case "ISTP", "istp" : {
				System.out.println("ISTP - �Ӻ���� ��������");	
				a = 0;
			}
			break;
			
			case "ISFP", "isfp" : {
				System.out.println("ISFP - ��Ʈ��ũ ��������");
				a = 0;
			}
			break;
			
			default:
				System.out.println("��Ȯ�� MBTI ������ �ƴϳ׿�. �ٽ� �Է����ּ���!");
				mbti = scan.next();
				}
			
		}

		scan.close();	
	}	
	
}
