package ch13_유용한클래스1;

public class EqualEx03 {

	public static void main(String[] args) {
		// Box2 객체 생성
		Box2 b1 = new Box2(10);
		Box2 b2 = new Box2(10);
		
		 // == 연산자로 두 객체의 주소값 비교
		System.out.println("1 >>> " + (b1 == b2));
		
		 // equals() 메서드로 두 객체의 내용 비교
		System.out.println("2 >>> " + (b1.equals(b2)));
	}
}

//Box2 클래스 선언
class Box2 {

	int x;

	// 생성자: 객체의 값이 들어가는 것 (생성자에서 전달된 값이 객체의 필드에 저장됨)
	public Box2(int x) {
		this.x = x;
	}

	// equals 메서드 재정의: 객체의 필드 값이 비교됨
	// 매개변수에 주소값이 들어감
	@Override
	public boolean equals(Object obj) {
		// Box2 b = (Box2)obj;
		// return x == b.x;
		// 객체의 필드 값이 비교되는 것, 값비교는 ==
		return x == ((Box2) obj).x;
	}

}

