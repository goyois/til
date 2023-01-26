package til.java.springframework;

import java.util.List;

public class MenuServiceImpl implements MenuService{
    @Override
    public List<Menu> getMenuList() {
        return List.of(
                new Menu(1L,"아메리카노",2500)
        );
    }
}
