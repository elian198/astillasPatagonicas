package com.astillasPatagonicas.controllers;

import com.astillasPatagonicas.entities.Aboutus;
import com.astillasPatagonicas.services.AboutusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AboutusControllers {

    @Autowired
    private AboutusServiceImpl aboutusService;

    public AboutusControllers(AboutusServiceImpl aboutusService) {
        this.aboutusService = aboutusService;
    }

    @GetMapping("/aboutus")
    public List<Aboutus> mostrar(){
        return aboutusService.mostrar();
    }

    @PostMapping("aboutus")
    public void crear(@RequestBody Aboutus aboutus){
        aboutusService.crear(aboutus);
    }

    @PutMapping("/aboutus")
    public Optional<Aboutus> actualizar(@RequestBody Aboutus aboutus){
        return aboutusService.actualizar(aboutus);
    }
    @DeleteMapping(value = "/aboutus/{id}")
    public  List<Aboutus> eliminar(@PathVariable Long id){
        return aboutusService.eliminar(id);
    }
}
