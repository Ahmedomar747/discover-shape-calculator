package factory;

import model.*;


public class ShapeFactory {

    public static Shape create(String shapeName) throws Exception {
        String shapeNameStripped = shapeName.toLowerCase();
        switch (shapeNameStripped) {
            case "rectangle" : return new Rectangle();
            case "triangle" : return new Triangle();
            case "circle" : return new Circle();
            case "square" : return new Square();
            default: throw new Exception("Shape not found");
        }
    }
}
