package til.java.springframework;

public class Menu {
    public long id;
    public String name;
    public int price;


    public Menu () {}

    public Menu(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
