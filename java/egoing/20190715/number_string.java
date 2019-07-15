class Number {
	public static void main(String[] args) {
		// 1. 숫자

		// 따옴표가 없는 숫자는 숫자로 인식
		System.out.println(1+2);
		// 3
		System.out.println(1.2+1.3);
		// 2.5

		// 곱하기 (*)
		System.out.println(2*5);
		// 10

		// 나누기
		System.out.println(6/2);
		// 3
	}
}

class CharString {
	public static void main(String[] args) {
		// 2. 문자(Character)와 문자열(String)
		// 문자: 한 글자
		// 문자열: 여러 개의 문자가 결합한 것

		// 문자 - 단따옴표
		System.out.println('생');

		// 문자열 - 쌍따옴표
		System.out.println("생활코딩");

		// 한 글자로 구성된 문자열
		System.out.println("생");

		// 문자열 안에 큰 따옴표를 넣고 싶을 때 - escape
		System.out.println("remember remember \"November fifth\"");

		// 여러 줄 표시
		System.out.println("도덕적\n인간은\n왜\n나쁜\n사회를\n만드는가\n");

		// 문자의 연산
		System.out.println("냉정"+"열정");
	}
}