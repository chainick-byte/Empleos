/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.controlador;

import com.leccion_2.empleos.modelos.Vacante;
import com.leccion_2.empleos.service.IVacantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author igorr
 */
@Controller
@RequestMapping("/vacantes")
public class VacantesController {

    @Autowired
    private IVacantesService vacanteService;
    
    //simplemente renderiza el formulario
    @GetMapping("/create")
    public String crear(){
        return "vacantes/formVacantes";
    }
    
    @PostMapping("/save")
    //aqui programamos el metodo por medio de anotacion @RequestParam, donde el nombre de las varaibales
    //tienen que coincidir con el nombre de atributos name del input
    public String guardar(@RequestParam("nombre") String nombre,@RequestParam("descripcion") String descripcion,
            @RequestParam("estatus") String estatus, @RequestParam("fecha") String fecha, @RequestParam("destacado")
            int destacado,@RequestParam("salario") double salario, @RequestParam("detalles") String detalles){
    //en caso de select pasamoe el valor numerico de cada opcion 
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: "+descripcion);
        System.out.println("Estatus" + estatus);
        System.out.println("Fecha de publicacion: " + fecha);
        System.out.println("Destacado: " + destacado);
        System.out.println("Salario ofrecido: "+ salario);
        System.out.println("Detalles: " + detalles);
        
        return "vacantes/listaVacantes";
    }

    //es un ejemplo al reves de JPA , es decir buscamos un path de tipo /vacantes/view/numero que
    //ponemos , y este numero se imprime en el lienzo
    @GetMapping("/view/{id}")
    public String verDetalle(@PathVariable("id") int idVacante, Model model) {
        Vacante vacante = vacanteService.buscarPorId(idVacante);
        System.out.println("Vacante: " + vacante);
        model.addAttribute("vacante", vacante);
        return "detalle";
    }

    //Ejemplo RequestParam de tipo get
    @GetMapping("/delete")
    public String eliminar(@RequestParam("id") int idVacante, Model model) {
        System.out.println("borrando el parametro id: " + idVacante);
        model.addAttribute("idVacante", idVacante);
        return "mensaje";
    }

}
