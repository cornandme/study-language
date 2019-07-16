class Variable {
	public static void main(String[] args) {
		// 1. 정수

		int a; // 변수 선언
		a = 1; // 변수에 값을 할당
		System.out.println(a+1); // 2

		a = 2;
		System.out.println(a+1); // 3


		// 2. 실수

		double b = 1.1;
		System.out.println(b+1.1); // 2.2

		b = 2.1;
		System.out.println(b+1.1); // 3.2


		// 3. 문자열

		String first = "생각하지 않는";
		System.out.println(first+" "+"사람들"); // 생각하지 않는 사람들

		// 여러 개의 변수 동시에 선언
		String c, d;
		c = "생각하지 않는";
		d = " 사람들";
		System.out.println(c+d); // 생각하지 않는 사람들

		// * 변수에 선언한 타입과 다른 타입의 값을 넣으면 오류가 발생함. 엄격한 언어!
		// * 두 변수의 타입이 다르면 연산할 수 없다. 역시 엄격한 언어!
		// * 한 번 선언된 변수와 같은 이름의 변수를 선언하여 갱신할 수 없다. 여윽시 엄격한 언어!
	}
}

// 세미콜론은 구문이 끝났음을 나타냄.