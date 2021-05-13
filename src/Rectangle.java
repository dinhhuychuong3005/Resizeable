

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double lenght;
    public Rectangle(){
        this.width = 1;
        this.lenght = 1;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.lenght = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return lenght;
    }

    public void setLength(double length) {
        this.lenght = length;
    }

    public double getArea() {
        return width * this.lenght;
    }

    public double getPerimeter() {
        return 2 * (width + this.lenght);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void rezide(double percent) {

    }
}

