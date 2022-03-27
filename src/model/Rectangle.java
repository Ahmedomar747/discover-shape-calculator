package model;

public class Rectangle extends Shape{
    @Override
    public double getArea(double[] parameters) throws Exception {
        if(parameters.length != 2){
            throw new Exception("Parameters not length invalid");
        }
        return parameters[0] * parameters[1];
    }

    @Override
    public double getPerimeter(double[] parameters) throws Exception {
        if(parameters.length != 2) {
            throw new Exception("Parameters not length invalid");
        }
        return 2 * parameters[0] + 2 * parameters[1];
    }
}
