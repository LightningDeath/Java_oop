public class Rectangle {
    private double width;
    private double height;

    /**
     * Конструктор по умолчанию
     */
    public Rectangle() {
        this.width = 3.5;
        this.height = 4.8;
    }

    /**
     * Произвольный конструктор
     *
     * @param width  - ширина прямоугольника
     * @param height - высота прямоугольника
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (height + width);
    }
}
