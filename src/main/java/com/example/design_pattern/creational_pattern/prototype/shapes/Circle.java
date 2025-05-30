package com.example.design_pattern.creational_pattern.prototype.shapes;

public class Circle extends Shape {

    public int radius;

    public Circle() {}

    public Circle(Circle target) {

        super(target);

        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {

        if (!(object2 instanceof Circle circle) || !super.equals(object2)) {
            return false;
        }

        return circle.radius == this.radius;
    }
}
