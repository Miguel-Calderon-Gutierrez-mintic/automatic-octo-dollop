/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.reto3completoMiguel.servicios;

import com.usa.reto3completoMiguel.modelentidades.Category;
import com.usa.reto3completoMiguel.repository.crud.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class CategoryService {

    @Autowired
    CategoryRepository CategoryRepo;

    public void guardar(Category Category) {
        CategoryRepo.save(Category);
    }

    public List<Category> buscarTodo() {
        return (List<Category>) CategoryRepo.findAll();
    }

}
