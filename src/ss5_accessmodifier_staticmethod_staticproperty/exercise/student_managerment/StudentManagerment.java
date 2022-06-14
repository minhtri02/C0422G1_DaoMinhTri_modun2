package ss5_accessmodifier_staticmethod_staticproperty.exercise.student_managerment;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class StudentManagerment {
    Scanner scanner = new Scanner(System.in);
    static Student[] students = new Student[100];

    static {
        students[0] = new Student( "tri", "QN", false, "tâmđù");
        students[1] = new Student("tri", "QN", false, "tâmđù");
        students[2] = new Student( "tri", "QN", false, "tâmđù");
        students[3] = new Student("huyen", "QN", false, "tâmđù");
    }

    public void display() {
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            } else {
                break;
            }
        }
    }
    public void add(){
//        System.out.println("nhập id");
//        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập giới tính");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("nhập email");
        String email = scanner.nextLine();
        Student student = new Student(name,address,gender,email);
        for (int i = 0; i <students.length ; i++) {
            if (students[i]==null){
                students[i]=student;
                break;
            }
        }
        display();
    }

    public void delete(){
        System.out.println("Bạn muốn xoá hs thứ mấy:");
        int index = scanner.nextInt();
        if (students[index]==null){
            System.out.println("không có học sinh ở vị trí "+index);
        }else {
            students[index]=null;

            for (int i = index; i < students.length; i++) {
                students[i]=students[i+1];
                if (students[i]==null){
                    break;
                }
            }
        }
        display();
    }

    public void edit(){
        System.out.println("Bạn muốn sửa hs học sinh thứ mấy:");
        int index = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập id");
//        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập giới tính");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("nhập email");
        String email = scanner.nextLine();
        students[index] = new Student(name,address,gender,email);
        display();
    }

    public void search(){
        System.out.println("Nhập tên học sinh bạn muốn tìm:");
        String name = scanner.nextLine();
        for (Student student : students) {
            if (student == null) {
                break;
            }
            if (Objects.equals(name, student.getName())) {
                System.out.println(student);
            }
        }
    }
}
