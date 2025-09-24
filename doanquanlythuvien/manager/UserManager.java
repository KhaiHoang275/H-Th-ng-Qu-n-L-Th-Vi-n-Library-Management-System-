package manager;

import service.UserService;
import java.util.Scanner;

public class UserManager {
    private UserService userService = new UserService();

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Quan ly nguoi dung ---");
        System.out.println("1. Them nguoi dung");
        System.out.println("2. Xoa nguoi dung");
        System.out.println("0. Thoat");
        System.out.print("Chon chuc nang: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                userService.addUser();
                break;
            case 2:
                userService.deleteUser();
                break;
            case 0:
                break;
            default:
                System.out.println("Lua chon khong hop le.");
        }
        // scanner.close();
    }
}
