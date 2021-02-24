package exercises.ex03.entities;

import exercises.ex03.entities.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape() {
    }

    public Shape(Color _color){
        color = _color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color _color) {
        color = _color;
    }

    public abstract double area();
}
