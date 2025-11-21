
import java.util.Scanner;


class Premitive{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Age;
        byte Std;
        char Sec ='C';
        long Mobile;
        System.out.println("Enter Your Age: ");
        Age=sc.nextInt();
        System.out.println("Enter Your Std: ");
        Std = sc.nextByte();

        System.out.println("Enter Your mobile number:");
        Mobile=sc.nextLong();
    
        System.err.println(Age);
        System.err.println(Std);
        System.err.println(Sec);
        System.err.println(Mobile);
        sc.close();
    }
}