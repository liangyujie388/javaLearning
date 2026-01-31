package controlflow;

/**
 * Java 循环语句示例
 * Loop Statements Examples
 */
public class LoopExample {
    public static void main(String[] args) {
        // 1. for 循环
        System.out.println("=== for 循环 ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("第 " + i + " 次循环");
        }
        
        // 2. while 循环
        System.out.println("\n=== while 循环 ===");
        int count = 1;
        while (count <= 5) {
            System.out.println("计数: " + count);
            count++;
        }
        
        // 3. do-while 循环
        System.out.println("\n=== do-while 循环 ===");
        int num = 1;
        do {
            System.out.println("数字: " + num);
            num++;
        } while (num <= 5);
        
        // 4. 增强 for 循环（for-each）
        System.out.println("\n=== 增强 for 循环 ===");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("元素: " + number);
        }
        
        // 5. break 语句
        System.out.println("\n=== break 语句 ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("遇到 6，退出循环");
                break;
            }
            System.out.println("i = " + i);
        }
        
        // 6. continue 语句
        System.out.println("\n=== continue 语句 ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("跳过 3");
                continue;
            }
            System.out.println("i = " + i);
        }
        
        // 7. 嵌套循环
        System.out.println("\n=== 嵌套循环（打印乘法表）===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}
