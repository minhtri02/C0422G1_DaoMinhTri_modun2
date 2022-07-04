package controrler;

import service.Iml.CustomerServiceImpl;
import service.Iml.EmployeeServiceImpl;
import service.Iml.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    private static final CustomerServiceImpl customerService = new CustomerServiceImpl();
    private static final FacilityServiceImpl facilityService = new FacilityServiceImpl();
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
            String choose = scanner.nextLine();
            switch (choose){
                case "1":
                    employeeManagements();
                    break;
                case "2":
                    CustomerManagements();
                    break;
                case "3":
                    facilityManagements();
                    break;
                case "4":
                    BookingManagements();
                    break;
                case "5":
                    PromotionManagements();
                    break;
                case "6":
                    flag=false;
                    System.out.println("Googbye, See you later !");
                    break;
                default:
                    System.out.println("Sai cú pháp!");
            }
        }while (flag);
    }
    private static void employeeManagements(){
        do {
            System.out.println("Employee Managerment:" +
                    "\n1. Display list employees" +
                    "\n2. Add new employee" +
                    "\n3. Edit employee" +
                    "\n4. Return main menu");
            String choose = scanner.nextLine();
            switch (choose){
                case "1":
                    employeeService.display();
                    break;
                case "2":
                    employeeService.Add();
                    break;
                case "3":
                    employeeService.Edit();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Sai cú pháp");
            }
        }while (true);
    }

    private static void CustomerManagements(){
        do {
            System.out.println("Customer Managerment:" +
                    "\n1. Display list customer" +
                    "\n2. Add new customer" +
                    "\n3. Edit customer" +
                    "\n4. Return main menu");
            String choose = scanner.nextLine();
            switch (choose){
                case "1":
                    customerService.display();
                    break;
                case "2":
                    customerService.Add();
                    break;
                case "3":
                    customerService.Edit();
                    break;
                case "4":
                   return;
                default:
                    System.out.println("Sai cú pháp");
            }
        }while (true);
    }

    private static void facilityManagements(){
        do {
            System.out.println("Facility Managerment:" +
                    "\n1. Display list facility" +
                    "\n2. Add new facility" +
                    "\n3. Display list facility maintenance" +
                    "\n4. Return main menu");
            String choose = scanner.nextLine();
            switch (choose){
                case "1":
                    facilityService.display();
                    break;
                case "2":
                    AddNewFacility();
                    break;
                case "3":
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Sai cú pháp!");
            }
        }while (true);
    }

    private static void AddNewFacility(){
        do {
            System.out.println("------ADD NEW FACILITY------" +
                    "\n1. Add New Villa" +
                    "\n2. Add New House" +
                    "\n3. Add New Room" +
                    "\n4. Back To Menu");
            String choose = scanner.nextLine();
            switch (choose){
                case "1":
                    facilityService.addNewVilla();
                    break;
                case "2":
                    facilityService.addNewHouse();
                    break;
                case "3":
                    facilityService.addNewRoom();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Sai cú pháp!");
            }
        }while (true);
    }

    private static void BookingManagements(){
        do {
            System.out.println("Booking Managerment:" +
                    "\n1. Add new booking" +
                    "\n2. Display list booking" +
                    "\n3. Create new constracts" +
                    "\n4. Display list contracts" +
                    "\n5. Edit contracts" +
                    "\n6. Return main menu ");
            String choose = scanner.nextLine();
            switch (choose){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Sai cú pháp!");
            }
        }while (true);
    }

    private static void PromotionManagements(){
        do {
            System.out.println("Promotion Managerment:" +
                    "\n1. Display list customers use service" +
                    "\n2. Display list customers get voucher" +
                    "\n3. Return main menu");
            String choose = scanner.nextLine();
            switch (choose){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Sai cú pháp!");
            }
        }while (true);
    }
}
