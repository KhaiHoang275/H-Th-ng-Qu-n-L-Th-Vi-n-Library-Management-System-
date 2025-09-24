import model.UserAccount;

public class Login {
    AccountManager ac = new AccountManager();
    public void performLogin(){
        UserAccount account = ac.login();
            
        if(account != null){
            if(account.getUsername().equals("admin")){
                System.out.println("Dang nhap thanh cong voi quyen admin: ");
                new LibraryManager().menu();
            }
            else{
                System.out.println("Dang nhap thanh cong: ");
                new UserInterface().menu();
            }
        }
        else System.out.println("Ban da nhap sai qua 3 lan. Chuong trinh ket thuc.");
    }
}
