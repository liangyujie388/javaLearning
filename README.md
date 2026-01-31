# Java 基础语法学习仓库 / Java Basics Learning Repository

欢迎来到 Java 基础语法学习仓库！这个仓库包含了 Java 编程语言的基础语法示例和教程。

## 📚 目录结构

```
javaLearning/
├── src/
│   ├── basics/          # 基础语法
│   │   ├── Variables.java      # 变量和数据类型
│   │   └── Operators.java      # 运算符
│   ├── controlflow/     # 控制流
│   │   ├── IfElseExample.java  # if-else 条件语句
│   │   ├── LoopExample.java    # 循环语句
│   │   └── SwitchExample.java  # switch 语句
│   ├── oop/             # 面向对象编程
│   │   ├── ClassAndObject.java      # 类和对象
│   │   ├── InheritanceExample.java  # 继承
│   │   ├── EncapsulationExample.java # 封装
│   │   └── PolymorphismExample.java  # 多态
│   ├── methods/         # 方法
│   │   └── MethodExample.java  # 方法定义和使用
│   ├── arrays/          # 数组和集合
│   │   ├── ArrayExample.java       # 数组
│   │   └── CollectionExample.java  # 集合框架
│   └── exceptions/      # 异常处理
│       └── ExceptionExample.java   # 异常处理
└── README.md
```

## 🚀 快速开始

### 环境要求
- JDK 8 或更高版本
- 任何 Java IDE（推荐 IntelliJ IDEA、Eclipse 或 VS Code）

### 运行示例

1. 克隆仓库：
```bash
git clone https://github.com/liangyujie388/javaLearning.git
cd javaLearning
```

2. 编译 Java 文件：
```bash
javac src/basics/Variables.java
```

3. 运行程序：
```bash
java -cp src basics.Variables
```

或者直接在 IDE 中打开项目，运行相应的 Java 文件。

## 📖 学习内容

### 1. 基础语法 (basics/)

#### Variables.java - 变量和数据类型
- 基本数据类型（byte, short, int, long, float, double, char, boolean）
- 引用数据类型（String）
- 常量声明
- 类型转换

#### Operators.java - 运算符
- 算术运算符（+, -, *, /, %）
- 关系运算符（==, !=, >, <, >=, <=）
- 逻辑运算符（&&, ||, !）
- 赋值运算符（=, +=, -=, *=, /=）
- 自增自减运算符（++, --）
- 三元运算符（? :）

### 2. 控制流 (controlflow/)

#### IfElseExample.java - 条件语句
- if 语句
- if-else 语句
- if-else-if 语句
- 嵌套 if 语句
- 多条件判断

#### LoopExample.java - 循环语句
- for 循环
- while 循环
- do-while 循环
- 增强 for 循环（for-each）
- break 和 continue 语句
- 嵌套循环

#### SwitchExample.java - Switch 语句
- 基本 switch 语句
- switch 字符串
- 多个 case 共享代码
- switch 实现计算器

### 3. 面向对象编程 (oop/)

#### ClassAndObject.java - 类和对象
- 类的定义
- 对象的创建
- 成员变量和方法
- 构造方法
- Getter 和 Setter 方法

#### InheritanceExample.java - 继承
- 父类和子类
- extends 关键字
- 方法重写（@Override）
- super 关键字
- 多态性

#### EncapsulationExample.java - 封装
- 访问修饰符（private, public）
- 数据隐藏
- 封装的优点
- 实际应用示例（银行账户）

#### PolymorphismExample.java - 多态
- 方法重载（Overloading）
- 方法重写（Overriding）
- 父类引用指向子类对象
- 多态的应用

### 4. 方法 (methods/)

#### MethodExample.java - 方法
- 无参数无返回值方法
- 有参数有返回值方法
- 方法重载
- 可变参数
- 递归方法
- 数组作为参数和返回值

### 5. 数组和集合 (arrays/)

#### ArrayExample.java - 数组
- 一维数组
- 二维数组
- 数组的遍历
- 数组的常用操作（排序、查找、填充）
- 数组的复制
- 数组统计（最大值、最小值、平均值）

#### CollectionExample.java - 集合框架
- ArrayList（动态数组）
- LinkedList（链表）
- HashSet（集合）
- HashMap（映射）
- Iterator（迭代器）

### 6. 异常处理 (exceptions/)

#### ExceptionExample.java - 异常处理
- try-catch 基本用法
- 多个 catch 块
- finally 块
- throws 关键字
- throw 关键字
- 自定义异常
- 异常链

## 💡 学习建议

1. **按顺序学习**：建议按照目录结构的顺序学习，从基础语法开始
2. **动手实践**：运行每个示例代码，观察输出结果
3. **修改代码**：尝试修改示例代码，理解每个语法的作用
4. **独立练习**：在理解示例后，尝试编写类似的程序
5. **循序渐进**：不要急于求成，扎实掌握每个知识点

## 🔗 相关资源

- [Oracle Java 官方文档](https://docs.oracle.com/en/java/)
- [Java SE 教程](https://docs.oracle.com/javase/tutorial/)
- [Java API 文档](https://docs.oracle.com/en/java/javase/11/docs/api/)

## 📝 贡献

欢迎提交 Issue 和 Pull Request 来改进这个学习仓库！

## 📄 许可证

本项目采用 MIT 许可证。

---

⭐ 如果这个仓库对你有帮助，请给个 Star！

Happy Coding! 🎉
