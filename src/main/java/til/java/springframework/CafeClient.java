package til.java.springframework;

import java.util.List;


public class CafeClient { //외부에서 객체를 주입한다.  외부 = 왠놈의 카페클라이언트
    public static void main(String[] args) {
        MenuService menuService = new MenuServiceImpl();  //1.아래 주입을 위한 서비스클래스의 객체 생성/2. 메뉴서비스스텁클래스의 객체를 생성해서 메뉴서비스 인터페이스에 할당/
        //인터페이스 객체에 구현클래스의 객체를 할당하는 것을 업캐스팅이라고 함
        MenuController menuController = new MenuController(menuService);  //생성자를 통해 파라미터  서비스클래스의 객체를 주입받으면 해당 클래스에 정의된 기능을 사용할 수 있다
        List<Menu> menuList = menuController.getMenuList();

    }
}

