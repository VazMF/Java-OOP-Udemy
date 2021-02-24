package exercises.ex03.entities;

import exercises.ex03.entities.enums.Color;

public class Circle extends Shape {

    private Double radius;

    public Circle() {
    }

    public Circle(Color _color, Double _radius) {
        super(_color);
        radius = _radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(double _radius) {
        radius = _radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
