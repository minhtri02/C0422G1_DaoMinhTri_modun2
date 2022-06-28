package controrler;

import model.Employee;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    public static void displayMainMenu(){
        boolean flag=true;
        do {
            System.out.println("Furama Menu\n" +
                    "1. Employee Managerment\n" +
                    "2. Customer Managerment\n" +
                    "3. Facility Managerment\n" +
                    "4. Booking Managerment\n" +
                    "5. Promotion Managerment\n" +
                    "6. Exit");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    employeeManagerment();
                    break;
                case 2:
                    CustomerManagerment();
                    break;
                case 3:
                    facilityManagerment();
                    break;
                case 4:
                    BookingManagerrment();
                    break;
                case 5:
                    PromotionManagerment();
                    break;
                case 6:
                    flag=false;
                    System.out.println("Googbye, See you later !");
                    break;
                default:
                    System.out.println("Sai cú pháp!");
            }
        }while (flag);
    }
    private static void employeeManagerment(){
        boolean flag = true;
        do {
            System.out.println("Employee Managerment:" +
                    "\n1. Display list employees" +
                    "\n2. Add new employee" +
                    "\n3. Edit employee" +
                    "\n4. Remove employee" +
                    "\n5. Return main menu");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.Add();
                    break;
                case 3:
                    employeeService.Edit();
                    break;
                case 4:
                    employeeService.Remove();
                    break;
                case 5:
                    flag =false;
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Sai cú pháp");
            }
        }while (flag);

    }
    private static void CustomerManagerment(){
        boolean flag = true;
        do {
            System.out.println("Customer Managerment:" +
                    "\n1. Display list customer" +
                    "\n2. Add new customer" +
                    "\n3. Edit customer" +
                    "\n4. Return main menu");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.Add();
                    break;
                case 3:
                    customerService.Edit();
                    break;
                case 4:
                    flag = false;
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Sai cú pháp");
            }
        }while (flag);
    }
    private static void facilityManagerment(){
        boolean flag = true;
        do {
            System.out.println("Facility Managerment:" +
                    "\n1. Display list facility" +
                    "\n2. Add new facility" +
                    "\n3. Display list facility maintenance" +
                    "\n4. Return main menu");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    flag = false;
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Sai cú pháp!");
            }
        }while (flag);
    }
    private static void BookingManagerrment(){
        boolean flag =true;
        do {
            System.out.println("Booking Managerment:" +
                    "\n1. Add new booking" +
                    "\n2. Display list booking" +
                    "\n3. Create new constracts" +
                    "\n4. Display list contracts" +
                    "\n5. Edit contracts" +
                    "\n6. Return main menu ");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    flag = false;
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Sai cú pháp!");
            }
        }while (flag);
    }
    private static void PromotionManagerment(){
        boolean flag = true;
        do {
            System.out.println("Promotion Managerment:" +
                    "\n1. Display list customers use service" +
                    "\n2. Display list customers get voucher" +
                    "\n3. Return main menu");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    flag = false;
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Sai cú pháp!");
            }
        }while (flag);
    }
}
