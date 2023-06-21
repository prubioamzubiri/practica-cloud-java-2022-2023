package com.cursojava.practica.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    @Test
    void testHBirthday() {

        Persona p1 = new Persona("0001", "juan", 3);

        assertEquals(3, p1.getAge());


    }
}
