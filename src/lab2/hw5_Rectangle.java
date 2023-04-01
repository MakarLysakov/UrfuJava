package lab2;

public class hw5_Rectangle {
    private int length;
    private int width;

    public hw5_Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int perimeter() {
        return (this.length + this.width) * 2;
    }

    public int area() {
        return this.length * this.width;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
