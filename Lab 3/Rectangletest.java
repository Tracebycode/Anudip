class Rectangle{
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int Area() {
        return length * width;
    }
}

public class Rectangletest{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(7, 3);

        if(rect.Area() > rect2.Area()) {
            System.out.println("Rectangle 1 has a larger area: " + rect.Area());
        } else if (rect.Area() < rect2.Area()) {
            System.out.println("Rectangle 2 has a larger area: " + rect2.Area());
        } else {
            System.out.println("Both rectangles have the same area: " + rect.Area());
        }
    }
}