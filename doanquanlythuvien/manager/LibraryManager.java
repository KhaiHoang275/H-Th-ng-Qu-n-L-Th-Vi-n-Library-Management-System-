package manager;

import java.util.Scanner;

public class LibraryManager {

    private BookManager bookManager;
    private UserManager userManager;
    private LoanManager loanManager;
    private PaymentManager paymentManager;

    public LibraryManager() {
        this.bookManager = new BookManager();
        this.userManager = new UserManager();
        this.loanManager = new LoanManager();
        this.paymentManager = new PaymentManager();
    }
    
    private static final Scanner scanner = new Scanner(System.in); 

    public void menu() {
        int option;
        do {
            System.out.println("\n===== HE THONG QUAN LY THU VIEN =====");
            System.out.println("1. Quan ly sach");
            System.out.println("2. Quan ly nguoi dung");
            System.out.println("3. Quan ly muon/tra");
            System.out.println("4. Xu ly thanh toan");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    bookManager.menu();
                    break;
                case 2:
                    userManager.menu();
                    break;
                case 3:
                    loanManager.menu();
                    break;
                case 4:
                    paymentManager.menu();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai");
            }
        } while (option != 0);

        // scanner.close();
    }
}