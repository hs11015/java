package comu_java_7;

import java.util.Scanner;

public class conditional_sentence {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
					
		System.out.println("당신의 MBTI에 해당하는 개발자 유형을 알려드려요!");
		System.out.print("아래에 MBTI를 입력해주세요! ");
		System.out.println("(모두 소문자 혹은 대문자로 입력해야 합니다)");
		String mbti = scan.next();
		int a = 1;

		while(a == 1) {
			
			switch (mbti) {		
			
			case "INTP", "intp" : {
				System.out.println("INTP - 백엔드형");
				a = 0;
			}
			break;
			
			case "ENFJ", "enfj" : {
				System.out.println("ENFJ - 프론트엔드형");
				
			}
			break;
			
			case "INFJ", "infj" : {
				System.out.println("INFJ - 풀스택형");					
				a = 0;
			}
			break;
			
			case "ISTJ", "istj" : {
				System.out.println("ISTJ - 퍼블리셔형");
				a = 0;
			}
			break;

			case "ENTJ", "entj" : {
				System.out.println("ENTJ - 아키텍쳐형");
				a = 0;
			}
			break;
			
			case "ISFJ", "isfj" : {
				System.out.println("ISFJ - 보안전문가형");
				a = 0;
			}
			break;
			
			case "INTJ", "intj" : {
				System.out.println("INTJ - 데이터분석가형");
				a = 0;
			}
			break;
			
			case "ENFP", "enfp" : {
				System.out.println("ENFP - AI형");
				a = 0;
			}
			break;
			
			case "ENTP", "entp" : {
				System.out.println("ENTP - iOS형");
				a = 0;
			}
			break;
			
			case "ESFJ", "esfj" : {
				System.out.println("ESFJ - 안드로이드형");
				a = 0;
			}
			break;
			
			case "ESFP", "esfp" : {
				System.out.println("ESFP - 게임 개발자형");
				a = 0;
			}
			break;
			
			case "ESTP", "estp" : {
				System.out.println("ESTP - IoT 개발형");
				a = 0;
			}
			break;
			
			case "ESTJ", "estj" : {
				System.out.println("ESTJ - QA 형");
				a = 0;
			}
			break;
			
			case "INFP", "infp" : {
				System.out.println("INFP - 블록체인형");
				a = 0;
			}
			break;
			
			case "ISTP", "istp" : {
				System.out.println("ISTP - 임베디드 개발자형");	
				a = 0;
			}
			break;
			
			case "ISFP", "isfp" : {
				System.out.println("ISFP - 네트워크 개발자형");
				a = 0;
			}
			break;
			
			default:
				System.out.println("정확한 MBTI 유형이 아니네요. 다시 입력해주세요!");
				mbti = scan.next();
				}
			
		}

		scan.close();	
	}	
	
}
