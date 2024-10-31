package ex10_08;

public class MainController {
    public static void main(String[] args) {
        Truck truck = new Truck("현대포터", 1.5);

        truck.move();
        truck.load();
    }
}