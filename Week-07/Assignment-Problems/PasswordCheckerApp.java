public class PasswordCheckerApp {

    private final String password;

    PasswordCheckerApp(String password) {
        this.password = password;
    }

    String getStrength() {

        if (password.length() < 6) {
            return "Weak";
        } 
        else if (password.length() <= 9) {
            return "Medium";
        } 
        else {
            return "Strong";
        }
    }

    public static void main(String[] args) {

        PasswordCheckerApp pc = new PasswordCheckerApp("abcd");
        System.out.println("Strength = " + pc.getStrength());

        PasswordCheckerApp pc2 = new PasswordCheckerApp("abcdefgh");
        System.out.println("Strength = " + pc2.getStrength());

        PasswordCheckerApp pc3 = new PasswordCheckerApp("abcdefghij");
        System.out.println("Strength = " + pc3.getStrength());
    }
}