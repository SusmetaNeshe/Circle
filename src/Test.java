public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(); // No-args constructor
        
        System.out.printf("circle1's radius: %d\n", circle1.getRadius());
        System.out.printf("circle1's perimeter: %.2f\n", circle1.perimeter());
        System.out.printf("circle1's area: %.2f\n", circle1.area());
        circle1.draw('*');
        System.out.printf("----------------------------------------\n");

        Circle circle2 = new Circle(5); // Parametrized constructor
        
        System.out.printf("circle2's radius: %d\n", circle2.getRadius());
        System.out.printf("circle2's perimeter: %.2f\n", circle2.perimeter());
        System.out.printf("circle2's area: %.2f\n", circle2.area());
        circle2.draw('+');
        System.out.printf("----------------------------------------\n");
        
        Circle circle3 = new Circle(circle2); // Copy constructor
        
        System.out.printf("circle3's radius: %d\n", circle3.getRadius());
        System.out.printf("circle3's perimeter: %.2f\n", circle3.perimeter());
        System.out.printf("circle3's area: %.2f\n", circle3.area());
        System.out.println("Setting circle3's radius to 7...");
        circle3.setRadius(7);
        System.out.printf("circle3's radius: %d\n", circle3.getRadius());
        System.out.printf("circle3's perimeter: %.2f\n", circle3.perimeter());
        System.out.printf("circle3's area: %.2f\n", circle3.area());
        
        circle3.draw('^');
        System.out.printf("----------------------------------------\n");

        System.out.printf("We have created %d circle objects so far\n", Circle.getCount());
        System.out.printf("----------------------------------------\n");

        // Trigger exception
        circle3.setRadius(0);
    } //end-main
} //end-Test