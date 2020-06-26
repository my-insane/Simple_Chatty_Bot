import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int oneNightCostHotel = scanner.nextInt();

        System.out.println(foodCostPerDay * duration + flightCost * 2 + oneNightCostHotel * (duration - 1));
    }
}