package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Java 集合框架示例
 * Collection Framework Examples
 */
public class CollectionExample {
    public static void main(String[] args) {
        // 1. ArrayList - 动态数组
        System.out.println("=== ArrayList 示例 ===");
        ArrayList<String> list = new ArrayList<>();
        
        // 添加元素
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        
        System.out.println("ArrayList: " + list);
        System.out.println("大小: " + list.size());
        System.out.println("第一个元素: " + list.get(0));
        
        // 修改元素
        list.set(1, "Go");
        System.out.println("修改后: " + list);
        
        // 删除元素
        list.remove("C++");
        System.out.println("删除后: " + list);
        
        // 遍历
        System.out.println("遍历 ArrayList:");
        for (String item : list) {
            System.out.println("  " + item);
        }
        
        // 2. LinkedList - 链表
        System.out.println("\n=== LinkedList 示例 ===");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addFirst(0);  // 在开头添加
        linkedList.addLast(4);   // 在末尾添加
        
        System.out.println("LinkedList: " + linkedList);
        System.out.println("第一个元素: " + linkedList.getFirst());
        System.out.println("最后一个元素: " + linkedList.getLast());
        
        // 3. HashSet - 不重复集合
        System.out.println("\n=== HashSet 示例 ===");
        HashSet<String> set = new HashSet<>();
        set.add("苹果");
        set.add("香蕉");
        set.add("橙子");
        set.add("苹果");  // 重复元素不会被添加
        
        System.out.println("HashSet: " + set);
        System.out.println("大小: " + set.size());
        System.out.println("包含'香蕉': " + set.contains("香蕉"));
        
        // 4. HashMap - 键值对映射
        System.out.println("\n=== HashMap 示例 ===");
        HashMap<String, Integer> map = new HashMap<>();
        
        // 添加键值对
        map.put("张三", 85);
        map.put("李四", 92);
        map.put("王五", 78);
        map.put("赵六", 88);
        
        System.out.println("HashMap: " + map);
        System.out.println("张三的分数: " + map.get("张三"));
        
        // 遍历 HashMap
        System.out.println("遍历 HashMap:");
        for (String key : map.keySet()) {
            System.out.println("  " + key + ": " + map.get(key));
        }
        
        // 5. Iterator 迭代器
        System.out.println("\n=== Iterator 示例 ===");
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        
        Iterator<String> iterator = languages.iterator();
        System.out.println("使用 Iterator 遍历:");
        while (iterator.hasNext()) {
            String lang = iterator.next();
            System.out.println("  " + lang);
        }
        
        // 6. 集合操作示例
        System.out.println("\n=== 集合操作 ===");
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            nums.add(i);
        }
        
        System.out.println("原始列表: " + nums);
        System.out.println("是否为空: " + nums.isEmpty());
        System.out.println("是否包含3: " + nums.contains(3));
        
        nums.clear();
        System.out.println("清空后: " + nums);
        System.out.println("是否为空: " + nums.isEmpty());
    }
}
