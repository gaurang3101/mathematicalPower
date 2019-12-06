import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeException, ZeroException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number - ");
        int n = sc.nextInt();
        System.out.println("Please enter the power - ");
        int p = sc.nextInt();
        MyCalculator mc = new MyCalculator(n, p);
        mc.power(n, p);
    }
}
