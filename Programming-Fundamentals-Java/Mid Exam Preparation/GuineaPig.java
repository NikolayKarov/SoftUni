package MidExamPreparation;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFoodInKilograms = Double.parseDouble(scanner.nextLine());
        double quantityHayInKilograms = Double.parseDouble(scanner.nextLine());
        double quantityCoverInKilograms = Double.parseDouble(scanner.nextLine());
        double guineasWeightInKilograms = Double.parseDouble(scanner.nextLine());

        double quantityFoodInGrams = quantityFoodInKilograms * 1000;
        double quantityHayInGrams = quantityHayInKilograms * 1000;
        double quantityCoverInGrams = quantityCoverInKilograms * 1000;
        double guineasWeightInGrams = guineasWeightInKilograms * 1000;


        boolean isNotEnough = false;
        for (int day = 1; day <= 30; day++) {
            quantityFoodInGrams = quantityFoodInGrams - 300;
            if (day % 2 == 0) {
                double leftHay = quantityFoodInGrams * 0.05;
                quantityHayInGrams = quantityHayInGrams - leftHay;
            }

            if (day % 3 == 0) {
                double leftCover = guineasWeightInGrams / 3;
                quantityCoverInGrams = quantityCoverInGrams - leftCover;

            }
            if (quantityFoodInGrams <= 0 || quantityHayInGrams <= 0 || quantityCoverInGrams <= 0) {
                isNotEnough = true;
                break;
            }
        }
        if (isNotEnough) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    quantityFoodInGrams / 1000, quantityHayInGrams / 1000, quantityCoverInGrams / 1000);
        }
    }
}
