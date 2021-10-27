package io.yadnyesh.udemy.abdbari.multithreading.assg;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends Thread {
    private Atm atm;
    private String customerName;
    private double amount;

    void useAtm() {
        atm.checkBalance(this.getCustomerName());
        atm.withdrawCash(this.getCustomerName(), this.getAmount());
    }
    public void run() {
        useAtm();
    }

    public static void main(String[] args) {
        Atm atm = new Atm();
        Customer yadnyesh = new Customer(atm, "Yadnyesh", 100);
        Customer bindiya = new Customer(atm, "Bindiya", 200);
        yadnyesh.start();
        bindiya.start();
    }
}
