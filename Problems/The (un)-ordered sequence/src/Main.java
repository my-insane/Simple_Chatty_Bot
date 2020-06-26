import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldNumber = scanner.nextInt();
        int newNumber = 0;
        boolean isSequence = true;
        int sequenceStatus = 0;
        while (scanner.hasNext()) {
            newNumber = scanner.nextInt();
            if (newNumber == 0) {
                System.out.println(isSequence);
                break;
            } else if (newNumber >= oldNumber && sequenceStatus != 1) {
                isSequence = true;
                sequenceStatus = 2;
                oldNumber = newNumber;
                continue;
            } else if (oldNumber >= newNumber && sequenceStatus != 2) {
                isSequence = true;
                sequenceStatus = 1;
                oldNumber = newNumber;
                continue;
            } else {
                isSequence = false;
            }
        }
    }
}