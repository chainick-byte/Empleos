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
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author igorr
 */
@Controller
@RequestMapping(value="/categoria")
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
    //ojo al pasar variables de los formulaios al metodo guardar, tienen que coincidir etiquetas
    //name con el nombre de parametros que pasamos !!!
    public String guardar(@RequestParam("nombre") String nombre,@RequestParam("descripcion")String descripcion){
        System.out.println("Categoria: "+ nombre);
        System.out.println("Descripcion:"+ descripcion);
        return "categoria/listCategorias";
    }
    
}
