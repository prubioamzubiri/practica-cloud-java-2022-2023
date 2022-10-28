package com.cursojava.practica.application;

import com.cursojava.practica.dominio.Persona;
import com.cursojava.practica.persistencia.*;

public class PersonaApplication implements IPersonaApplication{

    private IPersonaGBD GBD;

    public PersonaApplication(IPersonaGBD gbd)
    {
        this.GBD = gbd;
    }

    
    @Override
    public void addPersona(Persona p) {
        
        GBD.addPersona(p);
        
    }

    @Override
    public Persona getPersona(String id) {
        
        return GBD.getPersona(id);
    }

    @Override
    public void removePersona(String id) {
        
        GBD.removePersona(id);
        
    }
    
}
