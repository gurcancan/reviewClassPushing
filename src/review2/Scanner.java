package review2;

public class Scanner {
    public static void main(String[] args) {

        System.out.println("What is the day?");

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please enter the day number : ");


        int dayNum = input.nextInt();
        if (dayNum == 1) {
            String day = "Monday";
            System.out.println("Today is " + day);
        } else if (dayNum == 2) {
            String day = "Tuesday";
            System.out.println("Today is " + day);
        } else if (dayNum == 3) {
            String day = "Wednesday";
            System.out.println("Today is " + day);
        } else if (dayNum == 4) {
            String day = "Thursday";
            System.out.println("Today is " + day);
        } else if (dayNum == 5) {
            String day = "Friday";
            System.out.println("Today is " + day);
        } else if (dayNum == 6) {
            String day = "Weekend";
            System.out.println("Today is " + day);
        } else if (dayNum == 7) {
            String day = "Weekend";
            System.out.println("Today is " + day);
        } else {
            System.out.println("Wrong day number");
        }

    }
}
