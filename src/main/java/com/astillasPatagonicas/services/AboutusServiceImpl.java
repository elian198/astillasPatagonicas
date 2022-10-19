package com.astillasPatagonicas.services;

import com.astillasPatagonicas.entities.Aboutus;
import com.astillasPatagonicas.repository.AboutusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AboutusServiceImpl {

    @Autowired
    private AboutusRepository aboutusRepository;

    public AboutusServiceImpl(AboutusRepository aboutusRepository) {
        this.aboutusRepository = aboutusRepository;
    }

    public List<Aboutus> mostrar(){
        return aboutusRepository.findAll();
    }

    public void crear(Aboutus aboutus){
        aboutusRepository.save(aboutus);
    }

    public Optional<Aboutus> actualizar(Aboutus aboutus){
        if(aboutusRepository.existsById(aboutus.getId())){
            return aboutusRepository.findById(aboutus.getId());
        }
        return null;
    }

    public List<Aboutus> eliminar(Long id){
        aboutusRepository.deleteById(id);
        return aboutusRepository.findAll();
    }

}
