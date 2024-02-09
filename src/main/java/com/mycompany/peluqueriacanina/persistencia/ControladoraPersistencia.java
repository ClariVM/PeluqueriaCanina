package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    
    MascotaJpaController mascoJpa = new MascotaJpaController();
    DuenioJpaController duenioJpa = new DuenioJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        
        //en la BD el dueño
        duenioJpa.create(duenio);
        
        //en la BD la mascota
        mascoJpa.create(masco);
    }

    public List<Mascota> traerMascotas() {
        
        return mascoJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {

        try {
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
