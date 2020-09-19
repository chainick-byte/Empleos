/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author igorr
 */
@Controller
public class CategoriasController {
    //@GetMapping("/home")
    @RequestMapping(value="/home", method=RequestMethod.GET)
    public String mostrarHome(Model model){
        return "categoria/listCategorias";
    }
    //GetMapping("/create")
    @RequestMapping(value="/create", method=RequestMethod.GET)
    public String crear(){
        return "categoria/formCategorias";
    }
    //@PostMapping("/save")
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String guardar(){
        return "categoria/listCategorias";
    }
    
}
