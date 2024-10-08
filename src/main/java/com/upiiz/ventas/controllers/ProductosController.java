package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductosController {
    @GetMapping
    public String obtenerProductos() {
        return "Todos los productos son: ";
    }

    @GetMapping("/{id}")
    public String obtenerProductosPorId(@PathVariable int id) {
        return "El producto con id" + id + "es: ";
    }

    @PostMapping
    public String agregarProducto(@RequestBody String producto) {
        return "El producto" + producto + "fue agregado";
    }

    @PutMapping("/{id}")
    public String actualizarProducto(@PathVariable int id, @RequestBody String producto) {
        return "El producto con id" + id + "ha sido actualizado: " + producto;
    }

    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable int id) {
        return "El producto con id " + id + " ha sido eliminado";
    }

}
