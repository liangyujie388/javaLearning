package controlflow;

/**
 * Java if-else 条件语句示例
 * If-Else Conditional Statements Examples
 */
public class IfElseExample {
    public static void main(String[] args) {
        // 1. 基本 if 语句
        System.out.println("=== 基本 if 语句 ===");
        int score = 85;
        if (score >= 60) {
            System.out.println("考试及格！");
        }
        
        // 2. if-else 语句
        System.out.println("\n=== if-else 语句 ===");
        int age = 15;
        if (age >= 18) {
            System.out.println("成年人");
        } else {
            System.out.println("未成年人");
        }
        
        // 3. if-else-if 语句
        System.out.println("\n=== if-else-if 语句 ===");
        int grade = 88;
        if (grade >= 90) {
            System.out.println("成绩等级: A");
        } else if (grade >= 80) {
            System.out.println("成绩等级: B");
        } else if (grade >= 70) {
            System.out.println("成绩等级: C");
        } else if (grade >= 60) {
            System.out.println("成绩等级: D");
        } else {
            System.out.println("成绩等级: F");
        }
        
        // 4. 嵌套 if 语句
        System.out.println("\n=== 嵌套 if 语句 ===");
        int year = 2024;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " 是闰年");
                } else {
                    System.out.println(year + " 不是闰年");
                }
            } else {
                System.out.println(year + " 是闰年");
            }
        } else {
            System.out.println(year + " 不是闰年");
        }
        
        // 5. 多条件判断
        System.out.println("\n=== 多条件判断 ===");
        int temperature = 25;
        boolean isSunny = true;
        
        if (temperature > 20 && isSunny) {
            System.out.println("天气很好，适合外出！");
        } else if (temperature > 20 && !isSunny) {
            System.out.println("温度不错，但天气阴沉");
        } else {
            System.out.println("天气较冷");
        }
    }
}
