/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author igorr
 */
@Controller
@RequestMapping("/vacantes")
public class VacantesController {
    //es un ejemplo al reves de JPA , es decir buscamos un path de tipo /vacantes/view/numero que
    //ponemos , y este numero se imprime en el lienzo
    @GetMapping("/view/{id}")
    public String verDetalle(@PathVariable("id") int idVacante,Model model){
        System.out.println("idVacante: "+idVacante);
        model.addAttribute("idVacante",idVacante);
        return"vacantes/detalle";
    }
    
}
