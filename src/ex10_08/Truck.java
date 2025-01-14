package ex10_08;

public class Truck extends Car {
    private double payload;
    public Truck(String name, double payload) {
        super(name);
        this.payload = payload;
        System.out.printf("모델명 : %s\n", name);
        System.out.printf("적재량 : %.1f 톤\n", payload);
    }

    public void load() {
        System.out.printf("[%s]가 물건을 적재합니다. (최대 %.1f 톤)\n", getName(), payload);
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }
}