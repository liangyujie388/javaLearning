package arrays;

import java.util.Arrays;

/**
 * Java 数组示例
 * Array Examples
 */
public class ArrayExample {
    public static void main(String[] args) {
        // 1. 一维数组的声明和初始化
        System.out.println("=== 一维数组 ===");
        
        // 方式1：声明后初始化
        int[] numbers1 = new int[5];
        numbers1[0] = 10;
        numbers1[1] = 20;
        numbers1[2] = 30;
        numbers1[3] = 40;
        numbers1[4] = 50;
        
        // 方式2：声明时初始化
        int[] numbers2 = {1, 2, 3, 4, 5};
        
        // 方式3：使用 new 关键字初始化
        int[] numbers3 = new int[]{100, 200, 300};
        
        // 遍历数组
        System.out.println("numbers2 数组元素:");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();
        
        // 2. 增强 for 循环遍历数组
        System.out.println("\n=== 增强 for 循环 ===");
        String[] fruits = {"苹果", "香蕉", "橙子", "葡萄"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // 3. 数组的常用操作
        System.out.println("\n=== 数组操作 ===");
        int[] arr = {5, 2, 8, 1, 9, 3};
        System.out.println("原始数组: " + Arrays.toString(arr));
        
        // 排序
        Arrays.sort(arr);
        System.out.println("排序后: " + Arrays.toString(arr));
        
        // 查找元素
        int index = Arrays.binarySearch(arr, 8);
        System.out.println("元素 8 的索引: " + index);
        
        // 数组填充
        int[] filled = new int[5];
        Arrays.fill(filled, 10);
        System.out.println("填充数组: " + Arrays.toString(filled));
        
        // 4. 二维数组
        System.out.println("\n=== 二维数组 ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("二维数组内容:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // 5. 数组的复制
        System.out.println("\n=== 数组复制 ===");
        int[] original = {1, 2, 3, 4, 5};
        int[] copied = Arrays.copyOf(original, original.length);
        System.out.println("原始数组: " + Arrays.toString(original));
        System.out.println("复制数组: " + Arrays.toString(copied));
        
        // 6. 求数组的最大值、最小值和平均值
        System.out.println("\n=== 数组统计 ===");
        int[] data = {15, 23, 8, 42, 16};
        int max = data[0], min = data[0], sum = 0;
        
        for (int num : data) {
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }
        
        double average = (double) sum / data.length;
        System.out.println("数组: " + Arrays.toString(data));
        System.out.println("最大值: " + max);
        System.out.println("最小值: " + min);
        System.out.println("平均值: " + average);
    }
}
