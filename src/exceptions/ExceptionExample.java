package exceptions;

/**
 * Java 异常处理示例
 * Exception Handling Examples
 */
public class ExceptionExample {
    
    // 可能抛出异常的方法
    public static int divide(int a, int b) {
        return a / b;
    }
    
    // 使用 throws 声明异常
    public static void readFile(String filename) throws Exception {
        if (filename == null || filename.isEmpty()) {
            throw new Exception("文件名不能为空");
        }
        System.out.println("读取文件: " + filename);
    }
    
    // 自定义异常示例
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("年龄不合法: " + age);
        }
        System.out.println("年龄验证通过: " + age);
    }
    
    public static void main(String[] args) {
        // 1. try-catch 基本用法
        System.out.println("=== try-catch 基本用法 ===");
        try {
            int result = divide(10, 0);  // 会抛出 ArithmeticException
            System.out.println("结果: " + result);
        } catch (ArithmeticException e) {
            System.out.println("捕获异常: 不能除以零！");
            System.out.println("异常信息: " + e.getMessage());
        }
        
        // 2. 多个 catch 块
        System.out.println("\n=== 多个 catch 块 ===");
        try {
            String str = null;
            System.out.println(str.length());  // 会抛出 NullPointerException
            
            int[] arr = new int[5];
            System.out.println(arr[10]);  // 会抛出 ArrayIndexOutOfBoundsException
        } catch (NullPointerException e) {
            System.out.println("捕获空指针异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获数组越界异常");
        } catch (Exception e) {
            System.out.println("捕获其他异常: " + e.getMessage());
        }
        
        // 3. try-catch-finally
        System.out.println("\n=== try-catch-finally ===");
        try {
            System.out.println("执行 try 块");
            int result = divide(10, 2);
            System.out.println("结果: " + result);
        } catch (Exception e) {
            System.out.println("执行 catch 块");
        } finally {
            System.out.println("执行 finally 块（无论是否发生异常都会执行）");
        }
        
        // 4. throws 关键字
        System.out.println("\n=== throws 关键字 ===");
        try {
            readFile("test.txt");
            // readFile("");  // 会抛出异常
        } catch (Exception e) {
            System.out.println("捕获异常: " + e.getMessage());
        }
        
        // 5. 手动抛出异常
        System.out.println("\n=== 手动抛出异常 ===");
        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("年龄不能为负数");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("捕获异常: " + e.getMessage());
        }
        
        // 6. 自定义异常
        System.out.println("\n=== 自定义异常 ===");
        try {
            checkAge(25);   // 正常
            checkAge(200);  // 会抛出自定义异常
        } catch (InvalidAgeException e) {
            System.out.println("捕获自定义异常: " + e.getMessage());
        }
        
        // 7. try-with-resources (Java 7+)
        System.out.println("\n=== try-with-resources ===");
        System.out.println("自动管理资源的关闭");
        // 注意：这里只是演示语法，实际使用需要实现 AutoCloseable 接口
        
        // 8. 异常链
        System.out.println("\n=== 异常链 ===");
        try {
            try {
                int[] arr = new int[5];
                arr[10] = 100;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new RuntimeException("处理数组时发生错误", e);
            }
        } catch (RuntimeException e) {
            System.out.println("捕获异常: " + e.getMessage());
            System.out.println("原始异常: " + e.getCause());
        }
        
        System.out.println("\n程序继续正常执行...");
    }
}

// 自定义异常类
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
