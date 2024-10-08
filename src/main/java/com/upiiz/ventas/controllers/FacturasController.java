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
@RequestMapping("/api/v1/facturas")
public class FacturasController {

    @GetMapping
    public String obtenerFacturas() {
        return "Todas las facturas son: ";
    }

    @GetMapping("/{id}")
    public String obtenerFacturaPorId(@PathVariable int id) {
        return "La factura con id" + id + "es: ";
    }

    @PostMapping()
    public String agregarFactura(@RequestBody String factura) {
        return "La factura" + factura + "fue agregada";
    }

    @PutMapping("/{id}")
    public String actualizarFactura(@PathVariable int id, @RequestBody String factura) {
        return "La factura con id " + id + " ha sido actualizada correctamente";
    }

    @DeleteMapping("/{id}")
    public String eliminarFactura(@PathVariable int id) {
        return "La factura con id " + id + " ha sido eliminada";
    }
}
