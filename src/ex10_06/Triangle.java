package ex10_06;

public class Triangle extends Shape {
    private int width;
    private int height;

    @Override
    double area() {
        double result = 0.5 * width * height;
        return result;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}