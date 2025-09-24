import java.util.Scanner;
import service.*;


public class LibraryManager {
    private BookService bookService;
    private UserService userService;
    private LoanService loanService;
    private PaymentService paymentService;
    private Scanner scanner;

    // Quan ly sach
    private void BookManager() {
        System.out.println("\n--- Quan ly sach ---");
        System.out.println("1. Them sach");
        System.out.println("2. Xoa sach");
        System.out.println("3. Tim kiem sach");
        System.out.println("0. Thoat");
        System.out.print("Chon chuc nang: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                bookService.addBook();
                break;
            case 2:
                bookService.deleteBook();
                break;
            case 3:
                bookService.searchBook();
                break;
            case 0:
                break;
            default:
                System.out.println("Lua chon khong hop le.");
        }
    }

    // Quan ly nguoi dung
    private void UserManager() {
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
    }

    // Quan ly muon/tra
    private void LoanManager() {
        System.out.println("\n--- Quan ly muon/tra ---");
        System.out.println("1. Muon sach");
        System.out.println("2. Tra sach");
        System.out.println("0. Thoat");
        System.out.print("Chon chuc nang: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                loanService.issueLoan();
                break;
            case 2:
                loanService.processReturn();
                break;
            case 0:
                break;
            default:
                System.out.println("Lua chon khong hop le.");
        }
    }

    // Xu ly thanh toan
    private void PaymentManager() {
        System.out.println("\n--- Xu ly thanh toan ---");
        System.out.println("1. Thanh toan tien phat");
        System.out.println("2. Xem lich su thanh toan");
        System.out.println("3. Tinh tong tien phat");
        System.out.println("0. Thoat");
        System.out.print("Chon chuc nang: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                paymentService.processFinePayment();
                break;
            case 2:
                paymentService.viewPaymentHistory();
                break;
            case 3:
                paymentService.calculateTotalFine();
                break;
            case 0:
                break;
            default:
                System.out.println("Lua chon khong hop le.");
        }
    }

    public LibraryManager() {
        bookService = new BookService();
        userService = new UserService();
        loanService = new LoanService();
        paymentService = new PaymentService();
        scanner = new Scanner(System.in);
    }

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

            switch (option) {
                case 1:
                    BookManager();
                    break;
                case 2:
                    UserManager();
                    break;
                case 3:
                    LoanManager();
                    break;
                case 4:
                    PaymentManager();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai");
            }
        } while (option != 0);

        scanner.close();
    }
}