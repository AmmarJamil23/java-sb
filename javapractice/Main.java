public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    static int square(int number) {
        return number * number;
    }

    static String checkAge(int age) {
        if (age >= 18) {
            return "Adult";
        }
        else {
            return "Minor";
        }
    }
    public static void main(String[] args) {

        int result = add(23, 47);
        System.out.println(result);

        int result2 = square(30);
        System.out.println(result2);

        System.out.println(checkAge(23));
        System.out.println(checkAge(12));


        int[] nums = {23, 21, 65, 33, 22};

        for (int i = 0; i< nums.length; i++) {
            System.out.println(nums[i]);
        }


        String[] names = {"Ali", "Daniyal", "Chris"};

        for (String name : names) {
            System.out.println(name);
        }


        User user1 = new User("Ammar", 22);
        User user2 = new User("Daniyal", 20);

        System.out.println(user1.getAge());
        System.out.println(user2.getName());

        St user = new St("ali");
        System.out.println(user.getName());

        int res = Nst.sum(5505, 2304);
        System.out.println(res);
        // System.out.println("Java is running");

        // int age = 21;
        // double balance = 1050.75;
        // boolean isActive = true;
        // String name = "Ammar";

        // System.out.println(age);
        // System.out.println(balance);
        // System.out.println(isActive);
        // System.out.println(name);

        // int marks = 70;
        // if (marks >= 50) {
        //     System.out.println("You passed");
        // }
        // else {
        //     System.out.println("You Failed");
        // }

        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("Count " + i);

        // }
    }
}