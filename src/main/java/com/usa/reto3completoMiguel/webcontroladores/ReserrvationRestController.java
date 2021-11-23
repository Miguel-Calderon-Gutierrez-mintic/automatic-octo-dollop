/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.webcontroladores;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.usa.reto3completoMiguel.modelentidades.Reservation;
import com.usa.reto3completoMiguel.servicios.ReservationService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author USER
 */
@RestController
@RequestMapping("/api/Reservation")
public class ReserrvationRestController {

    @Autowired
    ReservationService Reservationserver;

    @GetMapping("/all")    
    public List<Reservation> list() {        
        List lista =Reservationserver.buscarTodo();     
        return lista;
    }

    @PostMapping("/save")
    public ResponseEntity post(@RequestBody Reservation Reservation) {
        Reservationserver.guardar(Reservation);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }

}
