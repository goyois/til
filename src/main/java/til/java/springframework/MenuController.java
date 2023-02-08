package til.java.springframework;

import java.util.List;


public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }


    public List<Menu> getMenuList() {
        return menuService.getMenuList();
    }
}
