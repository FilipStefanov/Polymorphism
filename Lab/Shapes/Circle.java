package Lab.Shapes;

public class Circle extends Shape {

    private Double radius;

    public Circle(Double radius) {
        super();
        this.radius = radius;
    }

    public final Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculatePerimeter() {
        super.setPerimeter(2 * Math.PI * this.radius);
        return super.getPerimeter();
    }

    @Override
    public Double calculateArea() {
        super.setArea( Math.PI * (this.radius * this.radius));
        return super.getArea();
    }
}
