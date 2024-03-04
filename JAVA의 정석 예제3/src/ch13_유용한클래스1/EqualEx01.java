package ch13_유용한클래스1;

public class EqualEx01 {

	public static void main(String[] args) {

		String str1 = new String("korea");
		String str2 = new String("korea");
		
		System.out.println(str1  == str2); //주소값 비교
		
		System.out.println(str1.equals(str2)); //두 문자열의 내용을 비교
	}

}

