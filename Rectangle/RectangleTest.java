package Rectangle;

public class RectangleTest {
    static void main (String[] args){
        Rectangle r = new Rectangle(2, 3, "blue");
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.getColor());
    }
}
