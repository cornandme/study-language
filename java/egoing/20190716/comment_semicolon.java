class comment_semicolon {
	// 1. 주석

	// 한줄 주석

	/*
	여
	러

	줄

	주
	석
	*/

	/**
	 * JavaDoc 주석
	 * 자바의 문서를 만들 때 사용한다고 한다.
	 * 
	 * 예)
	 * @param x The <code>int</code> to be printed.
	 */
	public void println(int x) {
		synchronized (this) {
			print(x);
			newLine();
		}
	}

	public static void main(String[] args) {
		// 2. 세미콜론: 문장의 끝

		// assignment statement
		double a = 21345.5432;

		// increment statement(?)
		a++;

		// invocation statement
		System.out.println("정서심리학");

		// object creation statement(?)
		Topaz myRuby = new Topaz();

		// 여러 문장 한줄 표현
		int c = 500; double d = 53415.5345;

	}
}