package manager;

import service.LoanService;
import java.util.Scanner;

public class LoanManager {
    private LoanService loanService = new LoanService();

    public void menu() {
        System.out.println("\n--- Quan ly muon/tra ---");
        System.out.println("1. Muon sach");
        System.out.println("2. Tra sach");
        System.out.println("0. Thoat");
        System.out.print("Chon chuc nang: ");
        Scanner scanner = new Scanner(System.in);
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
        // scanner.close();
    }
}
