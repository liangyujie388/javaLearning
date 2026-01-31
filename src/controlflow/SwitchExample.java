package controlflow;

/**
 * Java switch 语句示例
 * Switch Statement Examples
 */
public class SwitchExample {
    public static void main(String[] args) {
        // 1. 基本 switch 语句
        System.out.println("=== 基本 switch 语句 ===");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("无效的日期");
        }
        
        // 2. switch 字符串
        System.out.println("\n=== switch 字符串 ===");
        String fruit = "苹果";
        switch (fruit) {
            case "苹果":
                System.out.println("这是苹果");
                break;
            case "香蕉":
                System.out.println("这是香蕉");
                break;
            case "橙子":
                System.out.println("这是橙子");
                break;
            default:
                System.out.println("未知水果");
        }
        
        // 3. switch 多个 case 共享代码
        System.out.println("\n=== 多个 case 共享代码 ===");
        int month = 12;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "冬季";
                break;
            case 3:
            case 4:
            case 5:
                season = "春季";
                break;
            case 6:
            case 7:
            case 8:
                season = "夏季";
                break;
            case 9:
            case 10:
            case 11:
                season = "秋季";
                break;
            default:
                season = "无效月份";
        }
        System.out.println("月份 " + month + " 属于: " + season);
        
        // 4. switch 表达式（Java 12+）
        System.out.println("\n=== switch 计算器示例 ===");
        char operator = '+';
        int num1 = 10, num2 = 5;
        int result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                result = 0;
                System.out.println("无效运算符");
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
