package ex10_06;

public class Square extends Shape {
    private int width;

    @Override
    double area() {
        double result = Math.pow(width,2);
        return result;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}