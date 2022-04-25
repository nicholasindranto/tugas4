package tugas4;

public class Main extends Login {
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);        
    }    
}