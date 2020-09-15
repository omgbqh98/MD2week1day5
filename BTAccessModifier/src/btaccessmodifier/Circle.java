package btaccessmodifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {
    }


    public double getRadius(double r) {
        return (r*r)*Math.PI;
    }

    public double getArea(double r) {
        return 2 * r * Math.PI;
    }

    public void display() {
        System.out.println(this.radius+ " " +this.color);
    }
}
