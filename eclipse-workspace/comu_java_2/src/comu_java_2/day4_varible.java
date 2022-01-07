package comu_java_2;

public class day4_varible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "코뮤니티 Java를 자바";
		char group1 = 'B';
		long date = 20210708;
		int day = 4;
		boolean a= true;
		float accuracy = 0.999998f;
		
		System.out.printf("%s %c조\n", name, group1);
		System.out.printf("날짜 : %d\n", date);
		System.out.printf("%d일차\n", day);
		System.out.printf("오늘차 미션을 이행하는 데 무리가 없었습니까? : ");
		System.out.println(a);
		System.out.printf("정확도 : %f", accuracy);
	}

}
