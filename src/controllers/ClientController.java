package controllers;

import models.Client;
import services.ClientService;
import utils.Rounder;
import views.ClientView;

public class ClientController {

    ClientService service;
    ClientView view;

    public ClientController(ClientService service, ClientView view){
        this.service = service;
        this.view = view;
    }

    public void runApp(){

        view.getInputs();

        String name = service.getName();

        String paymentInitialRounded = Rounder.roundValue(
                service.calculatePayment());

        String discountRounded = Rounder.roundValue(
                service.calculateDiscount());

        String paymentRounded = Rounder.roundValue(
                service.calculateDiscountPayment());

        String output = "------------------------------\n" +
                "Имя клиента: " + name + "\n" +
                "Сума покупки (грн.): " + paymentInitialRounded + "\n" +
                "Сумма скидки (грн.): " + discountRounded + "\n" +
                "К оплате (грн.): " + paymentRounded;

        view.getOutput(output);
    }
}
