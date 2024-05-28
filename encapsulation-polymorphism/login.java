public class Main {
    public static void main(String[] args) {
        User user = new User();

        String loginResult = user.login();

        System.out.println(loginResult);
    }

    static class User {
        String username = "amram";
        String password = "password";

        String login() {
            if (username.equals("amram") && password.equals("password")) {
                return "Login successful!";
            } else {
                return "Invalid username or password. Please try again.";
            }
        }
    }
}
