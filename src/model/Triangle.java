package model;

public class Triangle extends Shape{
    @Override
    public double getArea(double[] parameters) throws Exception {
        if(parameters.length != 3){
            throw new Exception("Parameters length invalid");
        }
        double semiPerimeter = getPerimeter(parameters) / 2;
        return Math.sqrt(semiPerimeter
                * (semiPerimeter - parameters[0])
                * (semiPerimeter - parameters[1])
                * (semiPerimeter - parameters[2]));
    }

    @Override
    public double getPerimeter(double[] parameters) throws Exception {
        if(parameters.length != 3) {
            throw new Exception("Parameters length invalid");
        }
        return parameters[0] + parameters[1] + parameters[2];
    }
}
