package lab2;

public class hw6_Triangle implements hw6_Shape{

    private int a_side;
    private int b_side;
    private int c_side;

    public hw6_Triangle(int a_side, int b_side, int c_side) {
        this.a_side = a_side;
        this.b_side = b_side;
        this.c_side = c_side;
    }

    @Override
    public double getArea() {
        Float hp = (float) (getPerimeter()/2);
        return Math.sqrt(hp*(hp - a_side)*(hp - b_side)*(hp - c_side));
    }

    @Override
    public double getPerimeter() {
        return a_side + b_side + c_side;
    }
}
