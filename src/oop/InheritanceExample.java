package oop;

/**
 * Java 继承示例
 * Inheritance Examples
 */

// 父类（基类）
class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name + " 正在吃东西");
    }
    
    public void sleep() {
        System.out.println(name + " 正在睡觉");
    }
    
    public void displayInfo() {
        System.out.println("名字: " + name);
        System.out.println("年龄: " + age);
    }
}

// 子类1：狗
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // 调用父类构造方法
        this.breed = breed;
    }
    
    // 子类特有方法
    public void bark() {
        System.out.println(name + " 正在叫: 汪汪汪！");
    }
    
    // 方法重写（覆盖）
    @Override
    public void eat() {
        System.out.println(name + " 正在吃狗粮");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();  // 调用父类方法
        System.out.println("品种: " + breed);
    }
}

// 子类2：猫
class Cat extends Animal {
    private String color;
    
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    // 子类特有方法
    public void meow() {
        System.out.println(name + " 正在叫: 喵喵喵！");
    }
    
    // 方法重写
    @Override
    public void eat() {
        System.out.println(name + " 正在吃猫粮");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("颜色: " + color);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        System.out.println("=== 创建狗对象 ===");
        Dog dog = new Dog("旺财", 3, "金毛");
        dog.displayInfo();
        dog.eat();      // 调用重写的方法
        dog.sleep();    // 调用继承的方法
        dog.bark();     // 调用子类特有方法
        
        System.out.println("\n=== 创建猫对象 ===");
        Cat cat = new Cat("咪咪", 2, "白色");
        cat.displayInfo();
        cat.eat();      // 调用重写的方法
        cat.sleep();    // 调用继承的方法
        cat.meow();     // 调用子类特有方法
        
        System.out.println("\n=== 多态性示例 ===");
        // 父类引用指向子类对象
        Animal animal1 = new Dog("小黑", 4, "拉布拉多");
        Animal animal2 = new Cat("小白", 1, "黑色");
        
        animal1.eat();  // 调用 Dog 的 eat() 方法
        animal2.eat();  // 调用 Cat 的 eat() 方法
    }
}
