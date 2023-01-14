package review3;

public class Demo {
    public static void main(String[] args) {
        boolean a, b, c;
        a = b = c = true;

        if( !a || ( b && c ) ) {
            System.out.println("If executed");
        } else {
            System.out.println("else executed");
        }

    }

}
