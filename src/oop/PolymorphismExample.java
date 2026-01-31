package oop;

/**
 * Java 多态示例
 * Polymorphism Examples
 */

// 父类
class Shape {
    protected String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    // 计算面积（父类提供默认实现）
    public double calculateArea() {
        return 0;
    }
    
    // 计算周长
    public double calculatePerimeter() {
        return 0;
    }
    
    public void displayInfo() {
        System.out.println("形状: " + name);
        System.out.println("面积: " + calculateArea());
        System.out.println("周长: " + calculatePerimeter());
    }
}

// 子类1：圆形
class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        super("圆形");
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// 子类2：矩形
class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        super("矩形");
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return width * height;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

// 子类3：三角形
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(double side1, double side2, double side3) {
        super("三角形");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public double calculateArea() {
        // 使用海伦公式计算面积
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        System.out.println("=== 多态性示例 ===\n");
        
        // 创建形状数组（父类引用指向不同的子类对象）
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);
        
        // 使用多态性遍历并计算各个形状的面积和周长
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("--- 形状 " + (i + 1) + " ---");
            shapes[i].displayInfo();
            System.out.println();
        }
        
        // 演示方法重载（Overloading）
        System.out.println("=== 方法重载示例 ===");
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("2.5 + 3.7 = " + calc.add(2.5, 3.7));
        System.out.println("1 + 2 + 3 = " + calc.add(1, 2, 3));
    }
}

// 方法重载示例类
class Calculator {
    // 两个整数相加
    public int add(int a, int b) {
        return a + b;
    }
    
    // 两个浮点数相加
    public double add(double a, double b) {
        return a + b;
    }
    
    // 三个整数相加
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
