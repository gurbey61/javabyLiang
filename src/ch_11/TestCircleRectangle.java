package ch_11;

public class TestCircleRectangle {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle =
                new CircleFromSimpleGeometricObject(1,"blue", true );
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is  " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());


        RectangleFromSimpleGeometricObject rectangle =
                new RectangleFromSimpleGeometricObject(2, 4, "red", false);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

        // Display circle and rectangle properties with POLYMORPHISM
        System.out.println("Using POLYMORPHISM");
        displayObject(new CircleFromSimpleGeometricObject(1,"purple", false));
        displayObject(new RectangleFromSimpleGeometricObject(1,1,"violet", true));

        }

        /** Display geometric object propertiees */
        public static void displayObject(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());

    }
}
