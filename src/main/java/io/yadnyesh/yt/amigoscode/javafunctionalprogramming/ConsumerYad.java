package io.yadnyesh.yt.amigoscode.javafunctionalprogramming;

import lombok.extern.slf4j.Slf4j;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

@Slf4j
public class ConsumerYad {
    static String middleString = "! thanks for registering with your phone: ";

    public static void main(String[] args) {
        greetCustomerImperative(new Customer("Yadnyesh", "9980057410"));
        greetCustomerFunctional.accept(new Customer("Yadnyesh", "9980057410"));
        greetCustomerFunctionalV2.accept(new Customer("Yadnyesh", "9980057410"), false);
    }

    static void greetCustomerImperative (Customer customer) {
        log.info("Hello " + customer.customerName
               + middleString + customer.customerPhoneNumber);
    }

    static Consumer<Customer> greetCustomerFunctional = customer -> log.info("Consumer -> Hello " + customer.customerName
            + middleString + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerFunctionalV2 = (customer, showPhone) -> log.info("Consumer -> Hello " + customer.customerName
            + middleString
            + (Boolean.TRUE.equals(showPhone) ? customer.customerPhoneNumber : "Private Number"));

    static class Customer {

        final String customerName;
        final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
