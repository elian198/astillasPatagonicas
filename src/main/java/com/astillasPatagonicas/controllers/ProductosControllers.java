package com.astillasPatagonicas.controllers;

import com.astillasPatagonicas.entities.Productos;
import com.astillasPatagonicas.services.ProductosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductosControllers {

    @Autowired
    private ProductosServices productosServices;

    public ProductosControllers(ProductosServices productosServices) {
        this.productosServices = productosServices;
    }

    @GetMapping( value = "/productos")
    public ResponseEntity<List<Productos>> mostrarProductos(){
        return ResponseEntity.ok(productosServices.mostrarProductos());
    }
    @PostMapping(value = "/productos")
    public ResponseEntity<Productos> crear(@RequestBody Productos productos){
        if(productos.equals(null)){
            return ResponseEntity.notFound().build();
        }
        productosServices.crearProductos(productos);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/productos/")
    public ResponseEntity actualizar(@RequestBody Productos productos){
           if(productosServices.buscarPorId(productos.getId()).isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        productosServices.actualizar(productos);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/productos/{id}")
    public List<Productos> eliminar(@PathVariable Long id){
        if(productosServices.buscarPorId(id).isPresent()) {
            productosServices.borrarProductos(id);
            return productosServices.mostrarProductos();
        }
      return  null;
    }
}
