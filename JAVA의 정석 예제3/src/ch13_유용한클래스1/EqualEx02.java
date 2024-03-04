package ch13_유용한클래스1;

public class EqualEx02 {

	public static void main(String[] args) {

		Box b1 = new Box("korea");
		Box b2 = new Box("korea");
		// == 연산자는 객체의 레퍼런스 주소를 비교
		// 두 객체가 메모리 상에서 동일한 위치를 가리키는지 여부를 확인
		System.out.println("1 > " + (b1 == b2));  //  == 같은 객체니? 
		
		//equals() 메서드는 Object 클래스에서 상속받은 메서드
		//객체의 레퍼런스 주소를 비교 
		// == 와 비슷, 오버라이딩해서 값을 비교하도록 재정의해서 사용함 
		//재정의 하지 않아다면 두 객체가 서로 다른 메모리 공간을 가리키고 있기 때문에 false
		System.out.println("2 > " + (b1.equals(b2)));  // equals메서드를 오버라이딩하지 않았기 때문에
	}
}


// Box 클래스에서 equals() 메서드를 오버라이딩하지 않음
class Box{
	String str;
	public Box(String str) {
		this.str = str;
	}
	
}