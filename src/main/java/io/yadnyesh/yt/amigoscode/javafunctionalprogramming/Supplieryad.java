package io.yadnyesh.yt.amigoscode.javafunctionalprogramming;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.function.Supplier;

@Slf4j
public class Supplieryad {

    public static void main(String[] args) {
       log.info(getDBConnectionUrl());
       log.info(getDbConnectionUrlSupplier.get().toString());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDbConnectionUrlSupplier = () -> 
            List.of("jdbc://localhost:5432/users", "jdbc://localhost:5432/actions", "jdbc://localhost:5432/customers");

}
