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
@RequestMapping("/api/v1/categorias")

public class CategoriaController {
    // Respuesta para todas las categorias - GET
    // Respuesta para una categoria por id - GET
    // Añadir una categoría - POST
    // Actualizar una categoría - PUT
    // Eliminar una categoria - DELETE

    @GetMapping
    public String obtenerCategorias() {
        return "Listado de todas las categorías - GET";
    }

    @GetMapping("/{id}")
    public String obtenerCategoriasPorId(@PathVariable int id) {
        return "Listado de todas las categorías con id: " + id;
    }

    @PostMapping
    public String agregarCategoria(@RequestBody String categoria) {
        return "Agregar una categoría - POST" + categoria;
    }

    @DeleteMapping("/{id}")
    public String eliminarCategoriaPorId(@PathVariable int id) {
        return "Eliminar categoria - DELETE" + id;
    }

    @PutMapping("/{id}")
    public String actualizarCategoria(@PathVariable int id, @RequestBody String categoria) {
        return "Actualizar categoria - PUT" + categoria + "con id" + id;
    }
}