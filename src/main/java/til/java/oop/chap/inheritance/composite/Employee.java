package til.java.oop.chap.inheritance.composite;


//포함관계 : 클래스의 멤버로 다른 클래스 타입의 참조변수를 선언
// Employee 를 가지고 있다.
public class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void showInfo() {
        System.out.println(id + " " + name);
        System.out.println(address.city+ " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("서울", "한국");
        Address address2 = new Address("도쿄", "일본");

        Employee e1 = new Employee(1,"유재석",address1);
        Employee e2 = new Employee(2,"정준하",address2);

        e1.showInfo();
        e2.showInfo();
    }
}

class Address {
    String city,country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}