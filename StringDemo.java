import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Upper Case : " + str.toUpperCase());
        System.out.println("Lower Case : " + str.toLowerCase());
        System.out.println("Length     : " + str.length());

        sc.close();
    }
}