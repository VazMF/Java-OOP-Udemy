package exercises.ex03.entities;

import exercises.ex03.entities.enums.Color;

public class Rectangle extends Shape {

    private Double width;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Color _color, Double _width, Double _height) {
        super(_color);
        width = _width;
        height = _height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(double _width) {
        width = _width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(double _height) {
        height = _height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
