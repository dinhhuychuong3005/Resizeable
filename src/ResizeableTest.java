public class ResizeableTest {
    public static void main(String[] args) {
        double percent = (Math.random()*100);
        System.out.println("Mỗi hình dạng tăng " + percent);
        Resizeable[] resizeable = new Resizeable[3];
        resizeable[0] = new Circle(2);
        resizeable[1] = new Rectangle(3,7);
        resizeable[2] = new Square(4);
        for (Resizeable resizeable1 : resizeable){
            resizeable1.rezide(percent);
        }
        Shape [] shapes = new Shape[3];
        shapes[0] = (Circle) resizeable[0];
        shapes[1] = (Rectangle) resizeable[1];
        shapes[2] = (Square) resizeable[2];
        for (Shape shape : shapes){
            System.out.println(shape);
        }
    }


}
