## 2019.07.18.

## 형 변환

### 자동 형 변환
* 표현 범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환은 허용된다.  
	e.g. double인 변수에 float인 상수 할당 -> 상수의 타입이 double로 자동 변환.

### 명시적 형 변환
* 명시적 형 변환을 사용하면 자동 형 변환이 적용되지 않는 조건에서도 형 변환을 할 수 있다.  
	e.g. float a = (float)100.0;  



## 연산자

### 산술 연산자

* 연산 결과의 암시적 형변환  
	정수/정수 = 정수  
	실수/실수 = 실수  
	정수/실수 = 실수  

### 단항 연산자
\+    양  
\-    음  
\++   증가  (++i != i++)  
\--   감소  

### 연산의 우선순위
일반규칙을 따름. 필요하면 규칙 확인


## 비교와 Boolean

### 비교 연산자
==  
!=  
\>   
\>=   
