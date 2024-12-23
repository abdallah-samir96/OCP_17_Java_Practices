package sessions.patternmatching;

public class App {
    private static String getInfo(){
        return "Me";
    }
    public static void main(String[] args) {
        String info = getInfo();

        // Using switch with pattern matching (Java 17+)
        String result = switch (info) {
            case "D" -> {
                System.out.println("Hello");
                yield "Samir";
            }
            case "A" -> "hello world";
            default -> "This is the defaukt";
        };

        System.out.println(result);
    }
}
class Shape {
    // Base class for shapes
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) { this.length = length; this.width = width; }
}
