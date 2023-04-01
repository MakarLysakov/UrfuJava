package lab2;

public class hw6_Sq implements hw6_Shape{
    private int side;

    public hw6_Sq(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
