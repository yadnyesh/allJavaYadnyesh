package io.yadnyesh.udemy.abdbari.multithreading.assg;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Atm {

    synchronized public void checkBalance(String customerName) {
        log.info(customerName + " is checking balance");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            log.info("Exception when checking bank balance.");
        }
    }

    synchronized public void withdrawCash(String customerName, double amount) {
        log.info(customerName + " wants to withdraw cash.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            log.info("Exception when checking bank balance.");
        }
    }
}
