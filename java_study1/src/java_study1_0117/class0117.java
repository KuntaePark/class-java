package java_study1_0117;

public class class0117 {

	public static void main(String[] args) {
		
		int num = 20;
		//num = 34.56f;
		float pi = 3.14f;
		//num = pi;
		pi = num; //자동 형변환
		System.out.println(pi);
		num = (int) pi; //강제 형변환
	}
}
