
package com.mycompany.pelucanina.persistencia;

import com.mycompany.pelucanina.logica.Duenio;
import com.mycompany.pelucanina.logica.Mascota;
import com.mycompany.pelucanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
      //crear en la BD el Dueño
      duenioJpa.create(duenio);
      
      //crear en la BD la Mascota
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
