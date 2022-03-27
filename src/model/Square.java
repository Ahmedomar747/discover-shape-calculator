package model;

public class Square extends Shape {
    @Override
    public double getArea(double[] parameters) throws Exception {
        if(parameters.length != 1){
            throw new Exception("Parameters length invalid");
        }
        return parameters[0] * parameters[0];
    }

    @Override
    public double getPerimeter(double[] parameters) throws Exception {
        if(parameters.length != 1) {
            throw new Exception("Parameters length invalid");
        }
        return 4 * parameters[0];
    }
}
