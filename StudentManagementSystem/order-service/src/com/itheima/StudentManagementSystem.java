package com.itheima;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagementSystem {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        Student s1 = new Student("001", "张三", 20, "北京");
        Student s2 = new Student("002", "李四", 22, "上海");
        Student s3 = new Student("003", "王五", 21, "广州");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        showMenu(studentList);

    }

    public static void showMenu(ArrayList<Student> studentList) {
        Scanner sc=new Scanner(System.in);
        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.退出");

        while(true) {
            System.out.print("请输入您的选择：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent(studentList);
                    break;
                case 2:
                    removeStudent(studentList);
                    break;
                case 3:
                    changeStudent(studentList);
                    break;
                case 4:
                    queryStudent(studentList);
                    break;
                case 5:
                    System.out.println("感谢使用学生管理系统，再见！");
                    //结束程序
                    System.exit(0);
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;

            }
        }


    }
    public static void addStudent(ArrayList<Student>studentList){
        Student newStudent = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        newStudent.setId(sc.next());
        System.out.println("请输入学生姓名：");
        newStudent.setName(sc.next());
        System.out.println("请输入学生年龄：");
        newStudent.setAge(sc.nextInt());
        System.out.println("请输入学生地址：");
        newStudent.setAddress(sc.next());

        for(int i=0; i <studentList.size();i++){
            if(newStudent.getId()==studentList.get(i).getId()){
                System.out.println("学号已存在，添加失败！");
            }
        }
        studentList.add(newStudent);
        System.out.println("学生添加成功！");

    }

    public static void removeStudent(ArrayList<Student>studentList){
        Scanner sc = new Scanner (System.in);
        System.out.println("请输入要删除的学生学号：");
        String id = sc.next();
        for(int i=0; i <studentList.size();i++){
            if(id.equals(studentList.get(i).getId())){
                studentList.remove(i);
                System.out.println("学生删除成功！");
                return;
            }

        }
        System.out.println("学号不存在，删除失败！");

    }

    public static void changeStudent(ArrayList<Student>studentList){
        Scanner sc = new Scanner (System.in);
        System.out.println("请输入要修改的学生学号：");
        String id = sc.next();
        for(int i=0; i <studentList.size();i++){
            if(id.equals(studentList.get(i).getId())){
                System.out.println("请输入新的学生姓名：");
                studentList.get(i).setName(sc.next());
                System.out.println("请输入新的学生年龄：");
                studentList.get(i).setAge(sc.nextInt());
                System.out.println("请输入新的学生地址：");
                studentList.get(i).setAddress(sc.next());
                System.out.println("学生修改成功！");
                return;
            }

        }
        System.out.println("学号不存在，修改失败！");
    }

    public static void queryStudent(ArrayList<Student>studentList){
        if(studentList.size()==0){
            System.out.println("暂无学生信息，请添加后再查询！");
        }else {
            System.out.println("学号\t姓名\t年龄\t地址");
            for(int i=0 ; i< studentList.size(); i++){
                Student s= studentList.get(i);
                System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }
        }

    }

}
