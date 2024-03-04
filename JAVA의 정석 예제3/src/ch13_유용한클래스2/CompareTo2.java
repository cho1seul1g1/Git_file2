package ch13_유용한클래스2;

public class CompareTo2 {

	public static void main(String[] args) {
		//자바 문자열 비교 함수 compare(), compareTo()
	    // 107,111,114   /  101,110,103
		System.out.println( compareEx("kor", "eng"));
		
		//  107,111,114 / 109,97,116,104
		System.out.println( compareEx("kor", "math"));
		
		System.out.println( compareEx("kor", "kor"));
	}
	
	static int compareEx(String s1, String s2) {
		// compareTo 메서드는 문자열을 비교할 때, 두 문자열의 첫 번째 문자부터 순서대로 비교
		// 만약 첫 번째 문자가 같으면 다음 문자를 비교하고, 계속해서 비교
		// 문자열의 첫 번째 문자의 유니코드 코드 포인트 값만을 기준으로 비교
		return s1.compareTo(s2);
	}

}
