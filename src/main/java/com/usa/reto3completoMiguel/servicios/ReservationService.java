/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.servicios;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.usa.reto3completoMiguel.modelentidades.Reservation;
import com.usa.reto3completoMiguel.repository.crud.ReservationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
@JsonPropertyOrder({"idReservation", "StartDate", "devolutionDate", "status", "score"})
public class ReservationService {
    @Autowired
    ReservationRepository ReservationRepo;
    
    public void guardar(Reservation Reservation){    
        ReservationRepo.save(Reservation);
    }
    
    public List<Reservation>buscarTodo(){
        return (List<Reservation>) ReservationRepo.findAll();
    } 
}
