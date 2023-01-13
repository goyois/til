






1. 커피정보와 값을 설정한다

- Americano클래스에서 toString return값, 4000원이라는 금액을 
Coffee클래스 필드의 멤버변수 price에 this.를 통해 적용해준다.
= 아메리카노는 4000이다.

2. Customer의 buyCoffee 메서드가 실행
- 정의된 메서드가 실행되기위해서 커피의 정보가 필요하므로 Americano의 상위클래스인 coffee 참조뵨수 타입의 객체를 매개변수로 받는다.
- 필드에 선언된 50000원의 금액이 if문을 통해 구입가능여부를 확인하고 결과를 출력시킨다.
- 가진 돈이 커피가격보다 많다면(구매가 가능하다면) 그 돈에서 coffee의 가격을 차감시킨다.

3.메인 메서드에서 Customer의 인스턴스를 통해 customer 클래스의 buycoffee 메서드를 실행한다.

- Americano 클래스에 새로운 인스턴스(데이터)를 추가한다.