public class User {
    String name;
    String password;

    String login(){
        return "logging";
    }

    void register(){
        if (name.equals("") || password.equals("")) {
            System.out.println("Invalid login");
        } else {
            System.out.println("Success");
        }
    }
}
