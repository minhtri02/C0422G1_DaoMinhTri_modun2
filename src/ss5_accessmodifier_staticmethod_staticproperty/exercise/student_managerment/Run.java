package ss5_accessmodifier_staticmethod_staticproperty.exercise.student_managerment;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        displayMenu();
    }
    public static void displayMenu() {
        StudentManagerment studentManagerment = new StudentManagerment();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do
        {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Display" +
                    "\n 2. Add" +
                    "\n 3. Delete" +
                    "\n 4. Edit" +
                    "\n 5. Search" +
                    "\n 6. Exit");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    // code display
                    System.out.println("chức năng hiện thị");
                    studentManagerment.display();
                    break;
                case 2:
                    // code thêm mới
                    System.out.println("Chức năng thêm mới");
                    studentManagerment.add();
                    break;
                case 3:
                    // code xóa
                    System.out.println("chức năng xóa");
                    studentManagerment.delete();
                    break;
                case 4:
                    // code sửa
                    System.out.println("chức năng sửa");
                    studentManagerment.edit();
                    break;
                case 5:
                    // code tìm kiếm
                    System.out.println("chức năng tìm kiếm");
                    studentManagerment.search();
                    break;
                default:
                    flag=false;
                    System.out.println("bye bye!");
            }
        }while(flag);
    }


}
