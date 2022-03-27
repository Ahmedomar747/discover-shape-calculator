package model;

public class Circle extends Shape{
    private static final double PI = 3.14;
    @Override
    public double getArea(double[] parameters) throws Exception {
        if(parameters.length != 1){
            throw new Exception("Parameters length invalid");
        }
        return PI * ( parameters[0] * parameters[0]);
    }

    @Override
    public double getPerimeter(double[] parameters) throws Exception {
        if(parameters.length != 1) {
            throw new Exception("Parameters length invalid");
        }
        return 2 * PI * parameters[0];
    }
}
