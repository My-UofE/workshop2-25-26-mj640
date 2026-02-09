public class RectangleComputation {
    public static void main(String[] args) {
        if  (args.length != 2) {
            System.out.println("Please provide the height and width of the rectangle as arguments.");
            return;
        }

        double width = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        boolean isSquare = false;
        
        if (height/width == 1) {
            isSquare = true;
        }
        else {
            isSquare = false;
        }

        double area = (width * height);
        double perimeter = ((2 * width) + (2 * height));

        String shape;
        if (isSquare) {
            shape = "square";
        }
        else {
            shape = "rectangle";
        }

        System.out.println("shape: " + shape);
        System.out.println("area: " + (width * height));
        System.out.println("perimeter: " + perimeter);
    }
}
