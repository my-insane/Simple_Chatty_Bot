import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 1;
        while (value >= 0) {
            value = scanner.nextInt();
            if (value == 0) {
                break;
            } else if (value % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}