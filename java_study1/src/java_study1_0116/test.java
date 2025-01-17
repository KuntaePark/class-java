package java_study1_0116;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * 주석 여러줄
		 */
		System.out.println("자바 이클립스 테스트");
		
		//java 데이터 타입:
		//정수형 : byte, short, int, long
		//실수형 : float double
		//문자 : char
		//논리형 : boolean
		int age;
		age = 100;

		int num2 = 30; //변수 초기화
		int num3 = 43;
		System.out.println(num2);
		
		int blue = 20;
		int red = 15;
		int white = 0;
		
		int temp = red;
		red = blue;
		blue = temp;
		System.out.println("red:" + red);
		System.out.println("blue:" + blue);
	
		int birth_year = 1991;
		System.out.println(2024 - birth_year);
	
		float fnum = 2.1515f;
		System.out.println(fnum);
		
		char ch = 'a';
		System.out.println(ch);
		
		ch = 97; //ascii
		System.out.println(ch);
		
		ch -= 24;
		System.out.println(ch);
		System.out.println('J'-64);
		
		String name = "홍길동";
		
		boolean isTrue = true;
	}
}
