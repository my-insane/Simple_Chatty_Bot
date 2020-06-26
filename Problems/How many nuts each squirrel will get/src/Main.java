import java.util.Scanner;

class Main {
    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int squirrels = scanner.nextInt();
//        int nuts = scanner.nextInt();
//        System.out.println(nuts / squirrels);
        System.out.println(gcd(3,6));
        System.out.println(gcd(4,6));
        System.out.println(gcd(1, 1));
        System.out.println(gcd(6, 2));
        System.out.println(gcd(1, 3));
        System.out.println(gcd(3, 7));
    }
}