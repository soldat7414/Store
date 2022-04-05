package views;

import models.Client;
import utils.Validator;

import java.util.Scanner;

public class ClientView {

    Client model;
    String title;
    String name;
    int quantity;
    double price;
    int discountRate;
    Scanner scanner;

    public ClientView(Client model){
        this.model = model;
    }

    //Input data
    public void getInputs(){

        scanner = new Scanner(System.in);

        title = "Введите имя клиента: ";
        name =  name = Validator.validateName(scanner, title);
        model.setName(name);

        title = "Введите количество: ";
        quantity = Validator.validateQuantityAndRateInput(scanner, title);
        model.setQuantity(quantity);

        title = "Введите цену: ";
        price = Validator.validatePriceInput(scanner, title);
        model.setPrice(price);

        title = "Введите % дисконта: ";
        discountRate = Validator.validateQuantityAndRateInput(scanner, title);
        model.setDiscountRate(discountRate);

        scanner.close();
    }

    //Output data
    public void getOutput(String output){
        System.out.println(output);
    }
}
