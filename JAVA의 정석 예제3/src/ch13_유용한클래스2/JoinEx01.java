package ch13_유용한클래스2;

import java.util.Arrays;

public class JoinEx01 {

	public static void main(String[] args) {

		String animals = "dog,cat,bear";

		// split메서드는 쉼표(,)를 기준으로 분리하여 문자열 배열로 반환
		String[] arr = animals.split(",");

		for (String a : arr)
			System.out.println(a);

		// 배열을 스트림으로 변환한 후 각 요소를 출력
		Arrays.stream(arr).forEach(a -> System.out.println(a));

		//::메서드 참조 연산자
		// System.out은 클래스 이름
		// println은 메서드 이름
		// 람다 표현식에서 println 메서드를 호출하는 데 사용
		Arrays.stream(arr).forEach(System.out::println);
		

		// join() 메서드는 -구분자로하여 하나의 문자열로 결합
		String str = String.join("-", arr);
		System.out.println(str);

		str = String.join("*", arr);
		System.out.println(str);

	}

}

