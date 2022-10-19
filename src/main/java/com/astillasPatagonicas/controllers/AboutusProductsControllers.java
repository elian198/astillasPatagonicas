package com.astillasPatagonicas.controllers;

import com.astillasPatagonicas.entities.AboutusProducts;
import com.astillasPatagonicas.services.AboutusProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AboutusProductsControllers {

    @Autowired
    private AboutusProductsServices productsServices;

    public AboutusProductsControllers(AboutusProductsServices productsServices) {
        this.productsServices = productsServices;
    }

    @GetMapping(value = "/aboutusProducts")
    public List<AboutusProducts>  mostrar(){
        return productsServices.mostrar();
    }

    @PostMapping("/aboutusProducts")
    public void crear(@RequestBody AboutusProducts aboutusProducts){
        productsServices.crear(aboutusProducts);
    }

    @PutMapping("/aboutusProducts")
    public List<AboutusProducts> actualizar(@RequestBody AboutusProducts aboutusProducts){
        productsServices.actualizar(aboutusProducts);
        return productsServices.mostrar();
    }

    @DeleteMapping("aboutusProducts/{id}")
    public List<AboutusProducts> eliminar(@PathVariable Long id){
        productsServices.eliminar(id);
        return productsServices.mostrar();
    }
}
