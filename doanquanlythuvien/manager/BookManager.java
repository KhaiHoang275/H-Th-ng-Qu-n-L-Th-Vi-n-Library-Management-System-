package manager;

import service.BookService;
import java.util.Scanner;

public class BookManager {
    private BookService bookService = new BookService();

    public void menu() {
        System.out.println("\n--- Quan ly sach ---");
        System.out.println("1. Them sach");
        System.out.println("2. Xoa sach");
        System.out.println("3. Tim kiem sach");
        System.out.println("0. Thoat");
        System.out.print("Chon chuc nang: ");
        Scanner scanner = new Scanner(System.in);
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
        // scanner.close();
    }
}
