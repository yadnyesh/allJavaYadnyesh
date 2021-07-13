package io.yadnyesh.yt.amigoscode.javafunctionalprogramming;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Predicate;

@Slf4j
public class PredicateYad {
    public static void main(String[] args) {
        log.info(String.valueOf(isPhoneNumberValid("919980057410")));
        log.info(String.valueOf(isPhoneNumberValidPredicate.test("91998005741")));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("91") && phoneNumber.length() == 12;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber
            -> phoneNumber.startsWith("91") && phoneNumber.length() == 12;
}
