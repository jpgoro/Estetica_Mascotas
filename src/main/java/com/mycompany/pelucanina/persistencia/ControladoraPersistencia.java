
package com.mycompany.pelucanina.persistencia;

import com.mycompany.pelucanina.logica.Duenio;
import com.mycompany.pelucanina.logica.Mascota;

public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
      //crear en la BD el Dueño
      duenioJpa.create(duenio);
      
      //crear en la BD la Mascota
      mascoJpa.create(masco);
    }
    
}
