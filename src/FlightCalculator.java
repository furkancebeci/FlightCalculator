import java.util.Scanner;

public class FlightCalculator {
    public static void main(String[] args) {
        int distance, age, typeOfTrip;
        double total = 0, amount, ageDiscount = 0, tripDisc = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance(km): ");
        distance = input.nextInt();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter trip type (1 => one-way, 2 => round-trip): ");
        typeOfTrip = input.nextInt();

        switch (typeOfTrip) {
            case 1:
                System.out.println("You chose a one-way trip");
                total = (distance * 0.1);
                tripDisc = 0;
                break;
            case 2:
                total = ((distance * 2) * 0.1);
                tripDisc = total * 0.2;
                System.out.println("You chose a round-trip and got a 20% discount.");
                break;
        }

            if (age < 12) {
                ageDiscount = total * 0.5;
            } else if (age <= 24 && age >= 12) {
                ageDiscount = total * 0.10;
            } else if (age > 65) {
                ageDiscount = total * 0.3;
            }

        amount = (total - (ageDiscount + tripDisc));

        if (amount > 0 && (typeOfTrip == 1 || typeOfTrip == 2) && (distance > 0 || age > 0)) {
            System.out.println("Total price: " + amount + "TL");
        } else {
            System.out.println("You entered incorrect data!");
        }
    }
}
