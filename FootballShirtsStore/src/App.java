import database.Database;
import views.LoginView;

public class App {
    public static void main(String[] args) {
        Database.createTables();
        new LoginView();
    }
}
