
package com.Examen2.Examen.db;

import com.Examen2.Examen.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteRepository extends CrudRepository<Cliente, Integer>{
    
}
