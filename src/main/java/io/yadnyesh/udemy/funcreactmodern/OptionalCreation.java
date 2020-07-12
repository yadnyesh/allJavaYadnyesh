package io.yadnyesh.udemy.funcreactmodern;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {
        String val = "This is a string";
        Optional<String> optional = Optional.of(val);

        Optional<String> empty = Optional.empty();

        Optional<String> nullable = Optional.ofNullable(val);
        Optional<String> emptyOptional = Optional.ofNullable(null);
    }
}
