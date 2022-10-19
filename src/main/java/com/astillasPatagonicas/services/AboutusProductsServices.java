package com.astillasPatagonicas.services;

import com.astillasPatagonicas.entities.AboutusProducts;
import com.astillasPatagonicas.repository.AboutusProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AboutusProductsServices {

    @Autowired
    private AboutusProductsRepository repository;

    public AboutusProductsServices(AboutusProductsRepository repository) {
        this.repository = repository;
    }

    public void crear(AboutusProducts aboutusProducts){
        repository.save(aboutusProducts);
    }

    public AboutusProducts actualizar(AboutusProducts aboutusProducts){
        if(repository.existsById(aboutusProducts.getId())){
            repository.save(aboutusProducts);
            return aboutusProducts;
        }
        return null;
    }

    public List<AboutusProducts> mostrar(){
        return repository.findAll();
    }

    public List<AboutusProducts> eliminar(Long id){
        repository.deleteById(id);
        return repository.findAll();
    }

    public Optional<AboutusProducts> buscarPorId(Long id){
        return repository.findById(id);
    }
}
