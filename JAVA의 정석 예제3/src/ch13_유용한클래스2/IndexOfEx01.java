package ch13_유용한클래스2;

public class IndexOfEx01 {

	public static void main(String[] args) {
                  //012345678901
		String s = "abcdefabcdef";
		
		//두 번째 매개변수는 indexOf 메서드의 시작 위치를 지정
		int dix1 = s.indexOf('e',0);
		System.out.println(dix1);

		int dix2 = s.indexOf('f',6);
		System.out.println(dix2);
		
		
	}
	
	
}
