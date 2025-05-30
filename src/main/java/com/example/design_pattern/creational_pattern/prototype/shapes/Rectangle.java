package com.example.design_pattern.creational_pattern.prototype.shapes;

public class Rectangle extends Shape {

    public int width;
    public int height;

    public Rectangle() {}

    public Rectangle(Rectangle target) {

        super(target);

        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {

        if (!(object2 instanceof Rectangle rectangle) || !super.equals(object2)) {
            return false;
        }

        return rectangle.width == this.width && rectangle.height == this.height;
    }
}
