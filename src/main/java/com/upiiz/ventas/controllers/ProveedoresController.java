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
@RequestMapping("/api/v1/proveedores")
public class ProveedoresController {
    @GetMapping
    public String obtenerProveedores() {
        return "Todos los proveedores son: ";
    }

    @GetMapping("/{id}")
    public String obtenerProveedorPorId(@PathVariable int id) {
        return "El producto con id" + id + "es: ";
    }

    @PostMapping()
    public String agregarProveedor(@RequestBody String proveedor) {
        return "El proveedor" + proveedor + "ha sido agregado";
    }

    @PutMapping("/{id}")
    public String actualizarProveedor(@PathVariable int id, @RequestBody String proveedor) {
        return "El proveedor con id" + id + "ha sido actualizado: " + proveedor;
    }

    @DeleteMapping("/{id}")
    public String eliminarProveedor(@PathVariable int id) {
        return "El proveedor con id" + id + "ha sido eliminado.";
    }

}
