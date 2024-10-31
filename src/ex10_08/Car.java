package ex10_08;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        System.out.printf("[%s]가 이동중입니다.\n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}