/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.servicios;

import com.usa.reto3completoMiguel.modelentidades.Lib;
import com.usa.reto3completoMiguel.repository.crud.libRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author USER
 */
@Service
public class libService {
    @Autowired
    libRepository libRepo;
    
    
    public Lib guardar(Lib lib){ 
        if (lib.getId()==null) {
            libRepo.save(lib);
        }else{
            Optional<Lib> libaux = libRepo.findById(lib.getId());
            if (libaux.isEmpty()) {
                return libRepo.save(lib);
            }else{
                return lib;
            }
        }
        return null;
    }
    
    
    public List<Lib>buscarTodo(){
        return (List<Lib>) libRepo.findAll();
    }
    
    
    
}
