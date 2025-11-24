
import java.util.Scanner;

public class GreatestOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, res;
        System.out.println("Enter A value: ");
        a = sc.nextInt();
        System.out.println("Enter B value: ");
        b = sc.nextInt();
        System.out.println("Enter C value: ");
        c = sc.nextInt();

        res = (a > b ? (a > c ? a : c) : (b > c ? b : c));
        System.out.printf("greatest number amoung %s, %s, %s, is %s", a, b, c, res);
        sc.close();
    }
}
