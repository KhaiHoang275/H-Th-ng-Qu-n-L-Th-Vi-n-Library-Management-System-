import java.util.Scanner;
import model.UserAccount;
import manager.LibraryManager;

public class Login {
    private AccountManager accountManager = new AccountManager();

    public void performLogin(){
        Scanner sc = new Scanner(System.in);
        UserAccount account = null;
        int attempts = 0;

        do {
            System.out.print("Nhap username: ");
            String username = sc.nextLine();

            System.out.print("Nhap password: ");
            String password = sc.nextLine();

            account = accountManager.authenticate(username, password);

            if (account == null) {
                attempts++;
                System.out.println("Sai tai khoan hoac mat khau. Con " + (3 - attempts) + " lan thu lai.");
            }

        } while (account == null && attempts < 3);

        if (account != null) {
            if (account.getUsername().equals("admin")) {
                System.out.println("Dang nhap thanh cong voi quyen admin: ");
                new LibraryManager().menu();
            } else {
                System.out.println("Dang nhap thanh cong: ");
                new UserInterface().menu();
            }
        } else {
            System.out.println("Ban da nhap sai qua 3 lan. Chuong trinh ket thuc.");
        }
    }
}
