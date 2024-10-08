package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ventas")
public class VentasController {
    @GetMapping
    public String obtenerVentas() {
        return "Todas las ventas son: ";
    }

    @GetMapping("/{id}")
    public String obtenerVentaPorId(@PathVariable int id) {
        return "La venta con id" + id + "es: ";
    }

    @PostMapping
    public String agregarVenta(@RequestBody String venta) {
        return "La venta" + venta + "ha sido agregada";
    }

    @PutMapping("/{id}")
    public String actualizarVenta(@PathVariable int id, @RequestBody String venta) {
        return "La venta con id" + id + "ha sido actualizada: " + venta;
    }
}
