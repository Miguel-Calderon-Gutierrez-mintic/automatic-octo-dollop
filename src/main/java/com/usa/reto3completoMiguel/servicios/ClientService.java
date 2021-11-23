/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.servicios;

import com.usa.reto3completoMiguel.modelentidades.Client;
import com.usa.reto3completoMiguel.repository.crud.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class ClientService {

    @Autowired
    ClientRepository ClientRepo;

    public void guardar(Client client) {
        ClientRepo.save(client);
    }

    public List<Client> buscarTodo() {
        return (List<Client>) ClientRepo.findAll();
    }

}
