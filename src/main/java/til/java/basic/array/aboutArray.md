
자바에서 배열은 참조 타입에 해당한다.

- 기본 타입의 값을 변수에 할당하면 해당 변수에는 실제 값이 저장됨
> String name = "김주원"; = 실제 값 적용

- 참조 타입의 값을 변수에 할당하면 해당 변수에는 주소값이 저장됨
>  double [ ] temp = new double [ 3 ];

- 배열을 선언하는 시점에 배열이 몇개의 요소를 가질지 컴퓨터는 알 수 없다. 따라서 배열을 선언하면,
이후에 생성될 배열의 주소값을 담을 메모리 공간만이 확보된다. 이후 배열이 생성되고 난 다음에 해당 배열의 시작 주소값이
참조 변수에 할당된다.

    
  
## 가변 배열
- 마지막 차수에 해당하는 배열의 길이를 고정하지 않아도 됨
