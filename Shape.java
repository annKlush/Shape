package Shapes;
import java.lang.*;
class ShapeTest {
    public static void main(String[] args) {
        Shapes menu = new Shapes();

        //Quad
        menu.shapic(new Shapes.Quad());
        //Circle
        menu.shapic(new Shapes.Circle());
        //Oval
        menu.shapic(new Shapes.Oval());
        //Rectangle
        menu.shapic(new Shapes.Rectangle());
        //Pentagon
        menu.shapic(new Shapes.Pentagon());
    }
}

class Shapes {

    abstract static class Shape {
        abstract String getName();

    }

    static class Circle extends Shape {
        @Override
        String getName() {
            return "Circle";
        }
    }

    static class Quad extends Shape {
        @Override
        String getName() {
            return "Quad";
        }
    }

    static class Oval extends Shape {
        @Override
        String getName() {
            return "Oval";
        }
    }

    static class Rectangle extends Shape {
        @Override
        String getName() {
            return "Rectangle";
        }
    }

    static class Pentagon extends Shape {
        @Override
        String getName() {
            return "Pentagon";
        }
    }

    public void shapic(Shape shape) {
        System.out.println(shape.getName());
    }

}


