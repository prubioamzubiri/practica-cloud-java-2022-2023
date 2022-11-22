package com.cursojava.practica.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.cursojava.practica.dominio.Persona;
import com.cursojava.practica.persistencia.IPersonaGBD;

public class PersonaApplicationTest {

    @Mock
    IPersonaGBD igbd;
    
    @Test
    void testAddPersona() {

        Persona p1 = new Persona("1234", "pepe", 10),
                p2 = new Persona("1234", "peter", 20);

        igbd = Mockito.mock(IPersonaGBD.class);

        when(igbd.addPersona(p1)).thenReturn(true);
        when(igbd.getPersona("1234")).thenReturn(p1);
        when(igbd.addPersona(p2)).thenReturn(false);

        IPersonaApplication personaAplication = new PersonaApplication(igbd);

        boolean expValue1 = true,
                obtValue1 = personaAplication.addPersona(p1);

        assertEquals(expValue1, obtValue1);

        boolean expValue2 = false,
                obtValue2 = personaAplication.addPersona(p1);

        assertEquals(expValue2, obtValue2); 



    }
}
