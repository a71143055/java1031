package ex10_06;

import java.util.ArrayList;

public class MainController {
    public static void main(String[] args) {
        Square square = new Square();
        square.setWidth(7);
        square.name = "정사각형";

        Triangle triangle = new Triangle();
        triangle.setWidth(15);
        triangle.setHeight(9);
        triangle.name = "삼각형";

        Circle circle = new Circle();
        circle.setR(15);
        circle.name = "원";

        //    ArrayList<Shape> arrList = new ArrayList<Shape>();
        //    arrList.add(square);
        //    arrList.add(triangle);
        //    arrList.add(circle);

        Shape[] arr = {square, triangle, circle};

        viewShapes(arr);
    }

    public static void viewShapes(Shape[] arrList) {
        for (Shape shape : arrList) {
            System.out.printf("%s의 면적은 %.2f㎠\n", shape.name, shape.area());
        }
    }
}