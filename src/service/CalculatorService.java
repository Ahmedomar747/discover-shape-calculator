package service;

import factory.ShapeFactory;
import model.Shape;

public class CalculatorService {

    public static void calculate(String[] args) {
        try {
            String shapeName = InputService.getShapeName(args);
            double[] params = InputService.getShapeParameters(args);
            Shape shape = ShapeFactory.create(shapeName);
            double area = shape.getArea(params);
            double perimeter = shape.getPerimeter(params);
            System.out.println("Shape Area = " + area + ", Perimeter = " + perimeter);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
