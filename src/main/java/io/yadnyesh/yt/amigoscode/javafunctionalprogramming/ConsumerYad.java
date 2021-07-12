package io.yadnyesh.yt.amigoscode.javafunctionalprogramming;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsumerYad {
    public static void main(String[] args) {
        greetCustomer(new Customer("Yadnyesh", "9980057410"));
    }

    static void greetCustomer (Customer customer) {
       log.info("Hello " + customer.customerName
               + "! thanks for registering with your phone: " + customer.customerPhoneNumber);
    }

    static class Customer {

        final String customerName;
        final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
