package review3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int i=1;

        while (i<=4){
            System.out.println("Hello!!");
            i++;
        }
        System.out.println("**************w********");
        Scanner input=new Scanner(System.in);
        System.out.println("Are you tired? ");

        boolean tired=input.nextBoolean();

        while (tired){
            System.out.println("I need to rest");
        }



    }
}
