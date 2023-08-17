
package com.Examen2.Examen.db;

import com.Examen2.Examen.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
// para conectar con el crud
public interface IClienteRepository extends CrudRepository<Cliente, Integer>{
    
}
