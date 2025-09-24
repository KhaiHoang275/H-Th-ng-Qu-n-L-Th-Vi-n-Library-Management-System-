

import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import model.UserAccount;

public class AccountManager {
    private UserAccount[] accounts;
    private int count;

    public AccountManager(){
        accounts = new UserAccount[0];
        count = 0;
        loadAccounts();
    }

    // Doc tai khoan tu file
    private void loadAccounts(){
        String filePath = "accounts.txt";
        try{
            Scanner sc = new Scanner(new File(filePath));
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");
                if(parts.length == 2){
                    addAccount(new UserAccount(parts[0], parts[1]));
                }
            }
            sc.close();
        } catch(Exception e){
            System.out.println("Khong the doc file: " + e.getMessage());
            return;
        }
    }

    private void addAccount(UserAccount acc){
        accounts = Arrays.copyOf(accounts, accounts.length + 1);
        accounts[accounts.length - 1] = acc;
        count++;
    }

    // public Account login(){
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Nhap username: ");
    //     String username = sc.nextLine();
    //     System.out.print("Nhap password: ");
    //     String password = sc.nextLine();

    //     for(int i = 0; i < count; i++)
    //         if(accounts[i].login(username, password))
    //             return accounts[i];
    //     return null;
    // }
 public UserAccount authenticate(String username, String password) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].login(username, password)) {
                return accounts[i];
            }
        }   
        return null;
    }
}
