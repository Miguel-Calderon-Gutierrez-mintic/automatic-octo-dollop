/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.webcontroladores;

import com.usa.reto3completoMiguel.modelentidades.Category;
import com.usa.reto3completoMiguel.servicios.CategoryService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author USER
 */
@RestController
@RequestMapping("/api/Category")
public class CategoryRestController {

    @Autowired
    CategoryService Categoryserver;

    @GetMapping("/all")
    public List<Category> list() {
        return Categoryserver.buscarTodo();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void post(@RequestBody Category Category) {
        Categoryserver.guardar(Category);
        
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void put(@RequestBody Category category) {
        Categoryserver.update(category);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        Categoryserver.delete(id);
    }
}
