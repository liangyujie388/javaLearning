package methods;

/**
 * Java 方法示例
 * Method Examples
 */
public class MethodExample {
    
    // 1. 无参数无返回值的方法
    public static void greet() {
        System.out.println("你好，欢迎学习 Java！");
    }
    
    // 2. 有参数无返回值的方法
    public static void printMessage(String message) {
        System.out.println("消息: " + message);
    }
    
    // 3. 有参数有返回值的方法
    public static int add(int a, int b) {
        return a + b;
    }
    
    // 4. 多参数方法
    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
    
    // 5. 方法重载（Overloading）
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    // 6. 可变参数方法
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    
    // 7. 递归方法
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    // 8. 数组作为参数
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // 9. 数组作为返回值
    public static int[] createArray(int size, int value) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = value;
        }
        return arr;
    }
    
    // 10. 判断是否为质数
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        // 调用无参数无返回值方法
        System.out.println("=== 无参数无返回值方法 ===");
        greet();
        
        // 调用有参数无返回值方法
        System.out.println("\n=== 有参数无返回值方法 ===");
        printMessage("这是一条测试消息");
        
        // 调用有参数有返回值方法
        System.out.println("\n=== 有参数有返回值方法 ===");
        int result = add(10, 20);
        System.out.println("10 + 20 = " + result);
        
        // 调用多参数方法
        System.out.println("\n=== 多参数方法 ===");
        double avg = calculateAverage(80, 90, 85);
        System.out.println("平均值: " + avg);
        
        // 方法重载
        System.out.println("\n=== 方法重载 ===");
        System.out.println("2 * 3 = " + multiply(2, 3));
        System.out.println("2.5 * 3.5 = " + multiply(2.5, 3.5));
        System.out.println("2 * 3 * 4 = " + multiply(2, 3, 4));
        
        // 可变参数方法
        System.out.println("\n=== 可变参数方法 ===");
        System.out.println("sum(1, 2, 3) = " + sum(1, 2, 3));
        System.out.println("sum(1, 2, 3, 4, 5) = " + sum(1, 2, 3, 4, 5));
        
        // 递归方法
        System.out.println("\n=== 递归方法 ===");
        System.out.println("5! = " + factorial(5));
        System.out.println("7! = " + factorial(7));
        
        // 数组作为参数
        System.out.println("\n=== 数组作为参数 ===");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("数组内容: ");
        printArray(numbers);
        
        // 数组作为返回值
        System.out.println("\n=== 数组作为返回值 ===");
        int[] newArray = createArray(5, 10);
        System.out.print("创建的数组: ");
        printArray(newArray);
        
        // 判断质数
        System.out.println("\n=== 判断质数 ===");
        int[] testNumbers = {2, 7, 10, 17, 20};
        for (int num : testNumbers) {
            System.out.println(num + " 是质数: " + isPrime(num));
        }
    }
}
