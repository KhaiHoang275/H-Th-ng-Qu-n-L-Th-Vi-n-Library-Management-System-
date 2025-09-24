import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public void menu() {
        int option;
        do {
            System.out.println("\n===== GIAO DIEN NGUOI DUNG =====");
            System.out.println("1. Tim sach");
            System.out.println("2. Muon sach");
            System.out.println("3. Tra sach");
            System.out.println("0. Dang xuat");
            System.out.print("Chon chuc nang: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ban da chon: Tim sach");
                    break;
                case 2:
                    System.out.println("Ban da chon: Muon sach");
                    break;
                case 3:
                    System.out.println("Ban da chon: Tra sach");
                    break;
                case 0:
                    System.out.println("Dang xuat thanh cong.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (option != 0);
    }
}
