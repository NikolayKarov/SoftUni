import java.util.Scanner;

public class P01TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int producedBiscuitsPerDayPerWorker = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int producedByOtherFactory = Integer.parseInt(scanner.nextLine());

        int ownFactoryProduction = 0;
        double dailyProd = 0;

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                dailyProd = Math.floor((producedBiscuitsPerDayPerWorker * workers) * 0.75);
            } else {
                dailyProd = producedBiscuitsPerDayPerWorker * workers;
            }
            ownFactoryProduction += dailyProd;

        }
        int difference = Math.abs(ownFactoryProduction - producedByOtherFactory);
        double percentageDifference = (difference * 1.0 / producedByOtherFactory) * 100;

        System.out.printf("You have produced %d biscuits for the past month.%n", ownFactoryProduction);

        if (ownFactoryProduction > producedByOtherFactory) {
            System.out.printf("You produce %.2f percent more biscuits.", percentageDifference);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.", percentageDifference);
        }
    }
}
