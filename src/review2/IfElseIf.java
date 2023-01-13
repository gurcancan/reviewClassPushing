package review2;

public class IfElseIf {
    public static void main(String[] args) {

        String browser="chrome";

        if (browser.equals("chrome")){
            System.out.println("Test Cases executed on chrome");
        } else if (browser.equals("safari")) {
            System.out.println("Test cases executed on safari");
        } else if (browser.equals("firefox")) {
            System.out.println("Test cases executed on firefox");
        }else {
            System.out.println("Browser is not supported");
        }

    }
}
