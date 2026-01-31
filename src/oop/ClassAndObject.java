package oop;

/**
 * Java 类和对象示例
 * Class and Object Examples
 */

// 定义一个学生类
class Student {
    // 成员变量（属性）
    private String name;
    private int age;
    private String studentId;
    
    // 构造方法
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }
    
    // 无参构造方法
    public Student() {
        this.name = "未命名";
        this.age = 0;
        this.studentId = "000000";
    }
    
    // Getter 和 Setter 方法
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    // 成员方法
    public void study() {
        System.out.println(name + " 正在学习...");
    }
    
    public void displayInfo() {
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("学号: " + studentId);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // 创建对象
        System.out.println("=== 创建对象 ===");
        Student student1 = new Student("张三", 20, "2024001");
        Student student2 = new Student("李四", 21, "2024002");
        Student student3 = new Student(); // 使用无参构造方法
        
        // 访问对象属性和方法
        System.out.println("\n=== 学生1信息 ===");
        student1.displayInfo();
        student1.study();
        
        System.out.println("\n=== 学生2信息 ===");
        student2.displayInfo();
        student2.study();
        
        System.out.println("\n=== 学生3信息 ===");
        student3.displayInfo();
        
        // 修改对象属性
        System.out.println("\n=== 修改学生3信息 ===");
        student3.setName("王五");
        student3.setAge(19);
        student3.setStudentId("2024003");
        student3.displayInfo();
        
        // 获取对象属性
        System.out.println("\n=== 获取属性值 ===");
        System.out.println("学生1姓名: " + student1.getName());
        System.out.println("学生1年龄: " + student1.getAge());
    }
}
