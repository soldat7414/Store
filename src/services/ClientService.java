package services;

import base.Discount;
import base.Payment;
import models.Client;

public class ClientService implements Discount, Payment {

    private Client client;
    private double payment;
    private double discount;

    public ClientService (Client client){
        this.client = client;
    }
    @Override
    public double calculatePayment(){
        return payment = client.getQuantity() * client.getPrice();
    }

    @Override
    public double calculateDiscountPayment(){
        return payment - discount;
    }

    @Override
    public double calculateDiscount() {
        return discount = payment * client.getDiscountRate() / 100;
    }
}
