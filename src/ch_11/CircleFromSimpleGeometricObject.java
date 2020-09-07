package ch_11;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    // data field(s)
    private double radius;

    // Constructors
    public CircleFromSimpleGeometricObject() {

    }
    /** Overloaded constructor */
    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }
    /** Overloaded constructor */
    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
        // super(color, filled); // Alternative way
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
        // return Math.pow(radius,2) * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /** Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +    // super.getDateCreated()
                " and the radius is " + radius);
    }

    // Override the toString method defined in the superclass
    @Override
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }
}
