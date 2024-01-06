public class Circle {
 private static double PI = 3.14159;
 private static int count = 0;
 private int radius;
 
 //parametrized constructor
 public Circle (int radius) {
    this.radius=radius;
    count++; 
 }
 // No-arguments constructor
 public Circle() {
    this(1);
 }
 //Copy constructor
 public Circle( Circle c) {
    this (c.radius);
 }
 public static int getCount() {
    return count ;
 }
 public int getRadius() {
    return radius;
 }
 public void setRadius(int radius) {
    //TODO
    if (radius < 1) {
       throw new IllegalArgumentException();
   }
   this.radius = radius;
 }
 public double area() {
    return PI*radius*radius;
 }
 public double perimeter() {
    return 2*PI*radius;
 }
 public void draw(char ch) {
    for (int y = radius; y >= -radius; y--) {
       for (int x = -radius; x <= radius; x++) {
           if (x * x + y * y <= radius * radius) {
               System.out.print(ch);
           } else {
               System.out.print(" ");
           }
       }
       System.out.println();
   }
}
}
