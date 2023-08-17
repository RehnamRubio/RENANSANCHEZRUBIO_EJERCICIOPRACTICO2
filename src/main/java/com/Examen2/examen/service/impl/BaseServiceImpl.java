
package com.Examen2.Examen.service.impl;

import com.Examen2.Examen.service.IBaseService;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public class BaseServiceImpl<T,Y> implements IBaseService<T,Y>{
    protected final CrudRepository<T,Y> repository;
    
    public BaseServiceImpl(CrudRepository<T,Y> repository){
        this.repository = repository;
    }

    @Override
    public List<T> getAll() {
        return (List<T>) this.repository.findAll();
    }

    @Override
    public T save(T item) {
        return this.repository.save(item);
    }

    @Override
    public void delete(T item) {
        this.repository.delete(item);
    }

    @Override
    public Optional<T> getById(Y id) {
        return this.repository.findById(id);
    }
    
    
}
