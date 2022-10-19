package com.astillasPatagonicas.services;

import com.astillasPatagonicas.entities.Productos;
import com.astillasPatagonicas.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosServices {

    @Autowired
    ProductosRepository  productosRepository;

    public ProductosServices(ProductosRepository productosRepository) {
        this.productosRepository = productosRepository;
    }

    public void crearProductos(Productos productos){
        productosRepository.save(productos);
    }

    public List<Productos> mostrarProductos(){
        return productosRepository.findAll();
    }
    public List<Productos> borrarProductos(Long id){
         productosRepository.deleteById(id);
        return productosRepository.findAll();
    }

    public Productos actualizar(Productos productos){
        if(productosRepository.existsById(productos.getId())){
            productosRepository.save(productos);
            return productos;
        }
        return  null;
    }
    public Optional<Productos> buscarPorId(Long id){
        return productosRepository.findById(id);
    }
}
