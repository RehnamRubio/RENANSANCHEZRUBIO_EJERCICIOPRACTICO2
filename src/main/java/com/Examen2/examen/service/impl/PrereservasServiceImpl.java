
package com.Examen2.Examen.service.impl;

import com.Examen2.Examen.entities.Prereservas;
import com.Examen2.Examen.service.IPrereservasService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PrereservasServiceImpl extends BaseServiceImpl<Prereservas, Integer> implements IPrereservasService{
    public PrereservasServiceImpl(CrudRepository<Prereservas, Integer> repository) {
        super(repository);
    }
    
}
