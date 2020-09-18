/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.controlador;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author igorr
 */
@Controller
public class ControladorInicio {
    
    @GetMapping("listado")
    public String mostrarLista(Model model){
        List<String> lista= new LinkedList<String>();
        lista.add("Ingeniero de sistemas");
        lista.add("Auxiliar de contabilidad");
        lista.add("Vendedor");
        lista.add("Arquitecto");
        model.addAttribute("empleos", lista);
        return "listado";
    }
    
    @GetMapping("/")
    public String mostrarIndex(Model model ){
        String nombre="auxiliar de contabilidad";
        Date fechaPub=new Date();
        double salario=9000.0;
        boolean vigente =true;
        
        //al pasar al metodo el objeto de tipo model, 
        //podemos agregar a este modelo cualquier tipo de dato
        model.addAttribute("mensaje", "hola mundo mundial");
        //funciona de siguiente modo addAttribute primer valor es el nombre de la variable
        // el valor de la variable 
        //OJO:variable puede ser string int lista u otro objecto que se necesita pasar 
        model.addAttribute("fecha", new Date());
        //de esta forma se demuestra que podemos pasar cualquier objet !!!
        
        
        
        model.addAttribute("nombre", nombre);
        model.addAttribute("fechaPub", fechaPub);
        model.addAttribute("salario", salario);
        model.addAttribute("vigente", vigente);
        return "index";
    }
    
}
 




