package service;

public class InputService {

    public static String getShapeName(String[] args) throws Exception {
        if(args.length == 0 ) {
            throw new Exception();
        }
        return args[0];
    }

    public static double[] getShapeParameters(String[] args) throws Exception {
        try {
            double[] parameters = new double[args.length - 1];
            for (int i = 1; i < args.length; i++) {
                parameters[i - 1] = Double.parseDouble(args[i]);
            }
            return parameters;
        } catch (NumberFormatException e) {
            throw new Exception("Invalid number format");
        }
    }

}
