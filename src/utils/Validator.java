package utils;

import java.util.Scanner;

public class Validator {

    //Name validation
    public static String validateName (Scanner scanner){

        String str = scanner.nextLine().trim();
        while (str.isEmpty()){
            System.out.print("Пусто! Введите имя клиента: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    //Quantity validation
    public static  int validateQuantityInput(Scanner scanner){

        int quantity;
        String str1 = null;

        while (!scanner.hasNextInt()){
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\nВведите количество!: ", str);
        }
        quantity = scanner.nextInt();

        while (quantity <= 0) {
            System.out.println("Неверное значение! Введите количество: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество!: ");
            }
            quantity = scanner.nextInt();
        }

        return quantity;
    }

    //Price validation
    public static double validatePriceInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите цену!: ");
        }
        double price = scanner.nextDouble();
        while (price <= 0) {
            System.out.print("Неверное значение! Введите цену: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите цену!: ");
            }
            price = scanner.nextDouble();
        }
        return price;
    }

}
