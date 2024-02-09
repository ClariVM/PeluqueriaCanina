package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;


public class ControladoraPersistencia {
    
    
    MascotaJpaController mascoJpa = new MascotaJpaController();
    DuenioJpaController duenioJpa = new DuenioJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        
        //en la BD el dueño
        duenioJpa.create(duenio);
        
        //en la BD la mascota
        mascoJpa.create(masco);
    }
}
