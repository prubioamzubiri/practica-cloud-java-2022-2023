package com.cursojava.practica.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    @Test
    void testHBirthday() {

        Persona p = new Persona("0002", "pepe", 70, false);

        p.hBirthday();

        int expAge = 70;

        assertEquals(expAge, p.getAge());

    }
}
