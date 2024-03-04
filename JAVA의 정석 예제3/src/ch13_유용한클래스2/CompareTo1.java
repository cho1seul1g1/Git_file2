package ch13_유용한클래스2;

public class CompareTo1 {

	public static void main(String[] args) {
		 // 두 숫자를 비교하여 숫자로 반환하는 예제
        System.out.println(compareNumbers(10, 20));  // -1
        System.out.println(compareNumbers(30, 20));  // 1
        System.out.println(compareNumbers(10, 10));  // 0
	}
	
	static int compareNumbers(int num1, int num2) {
        // 두 숫자를 비교하여 결과를 반환
        if (num1 < num2) {
            return -1; // num1이 num2보다 작으면 음수 반환
        } else if (num1 > num2) {
            return 1; // num1이 num2보다 크면 양수 반환
        } else {
            return 0; // num1과 num2가 같으면 0 반환
        }
    }
}
