package oop;

/**
 * Java 封装示例
 * Encapsulation Examples
 */

class BankAccount {
    // 私有成员变量（封装）
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    // 构造方法
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("初始余额不能为负数，已设置为0");
        }
    }
    
    // 公共方法访问私有成员
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    // 只提供获取余额的方法，不允许直接设置
    public double getBalance() {
        return balance;
    }
    
    // 存款方法
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存款成功！存入金额: " + amount);
            System.out.println("当前余额: " + balance);
        } else {
            System.out.println("存款金额必须大于0");
        }
    }
    
    // 取款方法
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("取款成功！取出金额: " + amount);
            System.out.println("当前余额: " + balance);
        } else if (amount > balance) {
            System.out.println("余额不足！当前余额: " + balance);
        } else {
            System.out.println("取款金额必须大于0");
        }
    }
    
    // 显示账户信息
    public void displayAccountInfo() {
        System.out.println("账号: " + accountNumber);
        System.out.println("户主: " + accountHolder);
        System.out.println("余额: " + balance);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        System.out.println("=== 创建银行账户 ===");
        BankAccount account = new BankAccount("123456789", "张三", 1000.0);
        account.displayAccountInfo();
        
        System.out.println("\n=== 存款操作 ===");
        account.deposit(500.0);
        
        System.out.println("\n=== 取款操作 ===");
        account.withdraw(300.0);
        
        System.out.println("\n=== 尝试取款超过余额 ===");
        account.withdraw(2000.0);
        
        System.out.println("\n=== 尝试存入负数 ===");
        account.deposit(-100.0);
        
        System.out.println("\n=== 最终账户信息 ===");
        account.displayAccountInfo();
        
        // 注意：无法直接访问或修改 balance
        // account.balance = 10000; // 这行代码会报错，因为 balance 是私有的
    }
}
