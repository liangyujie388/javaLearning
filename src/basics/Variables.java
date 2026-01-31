package basics;

/**
 * Java 变量和数据类型示例
 * Variables and Data Types Examples
 */
public class Variables {
    public static void main(String[] args) {
        // 1. 基本数据类型 (Primitive Data Types)
        
        // 整数类型
        byte byteVar = 127;              // 8位，范围: -128 到 127
        short shortVar = 32767;          // 16位，范围: -32,768 到 32,767
        int intVar = 2147483647;         // 32位，范围: -2^31 到 2^31-1
        long longVar = 9223372036854775807L; // 64位，范围: -2^63 到 2^63-1
        
        // 浮点类型
        float floatVar = 3.14f;          // 32位单精度
        double doubleVar = 3.14159265359; // 64位双精度
        
        // 字符类型
        char charVar = 'A';              // 16位 Unicode 字符
        
        // 布尔类型
        boolean boolVar = true;          // true 或 false
        
        // 2. 引用数据类型 (Reference Data Types)
        String stringVar = "Hello, Java!";
        
        // 3. 输出变量
        System.out.println("=== 基本数据类型示例 ===");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("String: " + stringVar);
        
        // 4. 常量声明 (Constants)
        final double PI = 3.14159;
        final int MAX_SIZE = 100;
        System.out.println("\n=== 常量示例 ===");
        System.out.println("PI: " + PI);
        System.out.println("MAX_SIZE: " + MAX_SIZE);
        
        // 5. 类型转换 (Type Casting)
        System.out.println("\n=== 类型转换示例 ===");
        
        // 自动类型转换（小类型到大类型）
        int intNum = 100;
        double doubleNum = intNum;  // 自动转换
        System.out.println("int转double: " + doubleNum);
        
        // 强制类型转换（大类型到小类型）
        double d = 9.78;
        int i = (int) d;  // 强制转换
        System.out.println("double转int: " + i);
    }
}
