package review3;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean LoginButtonDisplayed = true;

        boolean LoginButtonClickable = false;

        if (LoginButtonDisplayed && LoginButtonClickable) {
            System.out.println("Test case is passed");
        } else {
            System.out.println("Test case is failed ");
        }

        System.out.println("********************************");


        boolean dashboard = true;

        String message = "Welcome Admin";

        if (dashboard || message.equals("Welcome Admin")) {
            System.out.println("User is successfully logged in");
        } else {
            System.out.println("User is not logged in !!!");
        }

        System.out.println("*************************************");


        boolean agreeCheckBoxSelected=true;

        if (!agreeCheckBoxSelected){
            System.out.println("I am clicking on checkbox");
        }

        System.out.println("I am clicking on submit button");


        System.out.println("*********************************");


        boolean boo=!false;

        System.out.println(boo);





    }
}
