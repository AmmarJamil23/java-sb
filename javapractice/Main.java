public class Main {
    public static void main(String[] args) {
        System.out.println("Java is running");

        int age = 21;
        double balance = 1050.75;
        boolean isActive = true;
        String name = "Ammar";

        System.out.println(age);
        System.out.println(balance);
        System.out.println(isActive);
        System.out.println(name);

        int marks = 70;
        if (marks >= 50) {
            System.out.println("You passed");
        }
        else {
            System.out.println("You Failed");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Count " + i);

        }
    }
}