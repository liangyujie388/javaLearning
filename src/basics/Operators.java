package basics;

/**
 * Java 运算符示例
 * Operators Examples
 */
public class Operators {
    public static void main(String[] args) {
        // 1. 算术运算符 (Arithmetic Operators)
        System.out.println("=== 算术运算符 ===");
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));  // 加法
        System.out.println("a - b = " + (a - b));  // 减法
        System.out.println("a * b = " + (a * b));  // 乘法
        System.out.println("a / b = " + (a / b));  // 除法
        System.out.println("a % b = " + (a % b));  // 取模
        
        // 2. 关系运算符 (Relational Operators)
        System.out.println("\n=== 关系运算符 ===");
        System.out.println("a == b: " + (a == b)); // 等于
        System.out.println("a != b: " + (a != b)); // 不等于
        System.out.println("a > b: " + (a > b));   // 大于
        System.out.println("a < b: " + (a < b));   // 小于
        System.out.println("a >= b: " + (a >= b)); // 大于等于
        System.out.println("a <= b: " + (a <= b)); // 小于等于
        
        // 3. 逻辑运算符 (Logical Operators)
        System.out.println("\n=== 逻辑运算符 ===");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // 逻辑与
        System.out.println("x || y: " + (x || y)); // 逻辑或
        System.out.println("!x: " + (!x));         // 逻辑非
        
        // 4. 赋值运算符 (Assignment Operators)
        System.out.println("\n=== 赋值运算符 ===");
        int c = 10;
        System.out.println("c = " + c);
        c += 5;  // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3;  // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2;  // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4;  // c = c / 4
        System.out.println("c /= 4: " + c);
        
        // 5. 自增自减运算符 (Increment/Decrement Operators)
        System.out.println("\n=== 自增自减运算符 ===");
        int num = 10;
        System.out.println("原始值: " + num);
        System.out.println("num++: " + (num++)); // 先使用后自增
        System.out.println("自增后: " + num);
        System.out.println("++num: " + (++num)); // 先自增后使用
        System.out.println("num--: " + (num--)); // 先使用后自减
        System.out.println("自减后: " + num);
        
        // 6. 三元运算符 (Ternary Operator)
        System.out.println("\n=== 三元运算符 ===");
        int age = 20;
        String result = (age >= 18) ? "成年人" : "未成年人";
        System.out.println("年龄 " + age + " 是: " + result);
    }
}
