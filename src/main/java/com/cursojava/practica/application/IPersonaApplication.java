package com.cursojava.practica.application;

import com.cursojava.practica.dominio.Persona;

public interface IPersonaApplication {

    public boolean addPersona(Persona p);

    public Persona getPersona (String id);

    public boolean removePersona (String id);

    
}