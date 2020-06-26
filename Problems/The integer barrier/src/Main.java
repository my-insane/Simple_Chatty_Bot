import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int sum = 0;
        while (scanner.hasNext()) {
            value = scanner.nextInt();
            if (sum >= 1000) {
                sum -= 1000;
                System.out.println(sum);
                break;
            } else if (value == 0) {
                System.out.println(sum);
                break;
            } else {
                sum += value;
            }
        }
    }
}