/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.controlador;

import com.leccion_2.empleos.modelos.Vacante;
import com.leccion_2.empleos.service.IVacantesService;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author igorr
 */
@Controller
public class ControladorInicio {

    @Autowired
    //añado anotacion autowired con lo indico donde quiero inyectar el cacho codigo marcado
    //con la anotacion de Service
    private IVacantesService vacanteService;

    @GetMapping("/tabla")
    public String mostrarTabla(Model model) {
        List<Vacante> lista = vacanteService.buscarTodas();
        model.addAttribute("vacantes", lista);
        return "tabla";
    }

    @GetMapping("/detalle")
    public String mostrarDetalle(Model model) {
        Vacante vacante = new Vacante();
        vacante.setNombre("Ingeniero de comunicaciones");
        vacante.setDescripcion("Se necesita un ingeniero para dar soporte a intranet");
        vacante.setFecha(new Date());
        vacante.setSalario(9700.0);
        model.addAttribute("vacante", vacante);
        return "detalle";
    }

    @GetMapping("/listado")
    public String mostrarLista(Model model) {
        List<String> lista = new LinkedList<String>();
        lista.add("Ingeniero de sistemas");
        lista.add("Auxiliar de contabilidad");
        lista.add("Vendedor");
        lista.add("Arquitecto");
        model.addAttribute("empleos", lista);
        return "listado";
    }

    @GetMapping("/")
    public String mostrarIndex(Model model) {
        List<Vacante> lista = vacanteService.buscarTodas();
        model.addAttribute("vacantes", lista);
        return "index";
    }

}
