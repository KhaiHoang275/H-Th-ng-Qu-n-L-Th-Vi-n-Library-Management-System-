package manager;

import service.PaymentService;
import java.util.Scanner;

public class PaymentManager {
    private PaymentService paymentService = new PaymentService();

    public void menu() {
        System.out.println("\n--- Xu ly thanh toan ---");
        System.out.println("1. Thanh toan tien phat");
        System.out.println("2. Xem lich su thanh toan");
        System.out.println("3. Tinh tong tien phat");
        System.out.println("0. Thoat");
        System.out.print("Chon chuc nang: ");
        Scanner scanner = new Scanner(System.in);
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
        // scanner.close();
    }
}
