package Shapes;

public class Main{
    
    public static void main(String[] args) {
        Shape[]  shapes = {new Circle(),
                new Rectangle(),
                new Oval(),
                new Quad(),
                new Pentagon()};

        for(Shape shape : shapes)
            System.out.println(shape.getName());
    }
}

