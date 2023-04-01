package lab2;

public class hw6_Circle implements hw6_Shape {
    private double m_radius;

    public hw6_Circle(double m_radius) {
        this.m_radius = m_radius;
    }

    @Override
    public double getArea() {
        return Math.PI * m_radius * m_radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * m_radius;
    }


}

