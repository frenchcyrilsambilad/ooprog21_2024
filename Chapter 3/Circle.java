public class Circle {
    static double radius, diameter, area;
    
    public Circle() {
        radius = 1;
        diameter = radius * 2;
        area = Math.PI * radius * radius;

    }

    public void setRadius(double rad) {
        radius = rad;
        diameter = radius * 2;
        area = Math.PI * radius * radius;
    }

        
    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }
}
