package io.yadnyesh.safari.javacookbook;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    public void testNameConcatenate() {
        Person yadnyesh = new Person("Yadnyesh", "Juvekar");
        String fullName = yadnyesh.getFullname();
        assertEquals("Yadnyesh Juvekar",fullName);
    }
}