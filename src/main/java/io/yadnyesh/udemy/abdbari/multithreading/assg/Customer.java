package io.yadnyesh.udemy.abdbari.multithreading.assg;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class Customer {
    Atm atm;
    String name;
    double amount;

    void useAtm() {
        double bankBalance = atm.checkBalance(this.getName());
        double withdrawCash = atm.withdrawCash(this.getName(), amount);

    }
}
