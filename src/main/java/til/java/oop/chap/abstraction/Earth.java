package til.java.oop.chap.abstraction;

abstract class Earth {
    public String tree;

    public abstract void color();
}

class Painter extends Earth{ //Earth 클래스로부터 상속
    public Painter() {
        this.tree = "소나무";
    }

    @Override
    public void color() {  //클래스를 상속한뒤 틀만 갖추어놓은 메서드를 가져와서 구현부를 하위클래스에서 완성시킴 -> 코드 재사용성이 높아짐
        System.out.println("소나무가 청록색이다.");
    }
}

class News {
    public static void main(String[] args) {
        Painter p = new Painter();
        p.color();
    }
}

