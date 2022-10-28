package com.cursojava.practica.application;

import com.cursojava.practica.dominio.Persona;

public interface IPersonaApplication {

    public void addPersona(Persona p);

    public Persona getPersona (String id);

    public void removePersona (String id);

    
}