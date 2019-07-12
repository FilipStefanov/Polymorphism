package Lab.Shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        super();
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public Double getWidth() {
        return this.width;
    }

    @Override
    public Double calculatePerimeter() {
        super.setPerimeter(this.height*2 + this.width*2);
        return super.getPerimeter() ;
    }

    @Override
    public Double calculateArea() {
        this.setArea(this.height * this.height);
        return super.getArea();
    }
}
