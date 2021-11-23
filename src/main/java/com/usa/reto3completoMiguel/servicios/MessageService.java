/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.servicios;

import com.usa.reto3completoMiguel.modelentidades.Message;
import com.usa.reto3completoMiguel.repository.crud.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepo;

    public void guardar(Message Message) {
        messageRepo.save(Message);
    }

    public List<Message> buscarTodo() {
        return (List<Message>) messageRepo.findAll();
    }

}
