package Shapes;


class ShapeInt {
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

    static class Reqtangle extends Shape {
        @Override
        String getName() {
            return "Reqtangle";
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


class GameMenuTest {
    public static void main(String[] args) {
        ShapeInt menu = new ShapeInt();

        //Quad
        menu.shapic(new ShapeInt.Quad());
        //Circle
        menu.shapic(new ShapeInt.Circle());
        //Oval
        menu.shapic(new ShapeInt.Oval());
        //Reqtangle
        menu.shapic(new ShapeInt.Reqtangle());
        //Pentagon
        menu.shapic(new ShapeInt.Pentagon());
    }
}