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
@RequestMapping("/api/v1/clientes")

public class ClientesController {
    @GetMapping
    public String obtenerClientes() {
        return "Listado de todos clientes";
    }

    @GetMapping("/{id}")
    public String obtenerClientePorId(@PathVariable int id) {
        return "Cliente con id: " + id;
    }

    @PostMapping
    public String agregarCliente(@RequestBody String cliente) {
        return "El siguiente cliente fue agregado: " + cliente;
    }

    @PutMapping("/{id}")
    public String actualizarClientePorId(@PathVariable int id, @RequestBody String cliente) {
        return "El cliente" + cliente + "con id" + id + "fue actualizado";
    }

    @DeleteMapping("/{id}")
    public String eliminarClientePorId(@PathVariable int id) {
        return "El cliente con id: " + id + "fue eliminado";
    }

    @GetMapping("/{id}/facturas")
    public String obtenerFacturasDeCliente(@PathVariable int id) {
        return "Las facturas del cliente con id " + id + " son: ";
    }

    @GetMapping("/{id}/facturas/{id2}")
    public String obtenerFacturaDeCliente(@PathVariable int id, @PathVariable int id2) {
        return "La factura con id " + id2 + " del cliente con id " + id + " es: ";
    }
}