/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.controlador;

import com.leccion_2.empleos.modelos.Categoria;
import com.leccion_2.empleos.service.CategoriaServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author igorr
 */
@Controller
@RequestMapping(value="/categoria")
public class CategoriasController {
    @Autowired
    
    private CategoriaServiceImpl categoriaController;
    
    //@GetMapping("/home")
    @RequestMapping(value="/home", method=RequestMethod.GET)
    public String mostrarHome(Model model){
        return "categoria/listCategorias";
    }
    //GetMapping("/create")
    @RequestMapping(value="/create", method=RequestMethod.GET)
    public String crear(Categoria categoria){
        return "categoria/formCategorias";
    }
    //@PostMapping("/save")
    @RequestMapping(value="/save", method=RequestMethod.POST)
    //ojo al pasar variables de los formulaios al metodo guardar, tienen que coincidir etiquetas
    //name con el nombre de parametros que pasamos !!!
    public String guardar(Categoria categoria,BindingResult bindingResult, RedirectAttributes flashAttributes){
        categoriaController.guardar(categoria);
        if(bindingResult.hasErrors()){
            for(ObjectError error: bindingResult.getAllErrors()){
                System.err.println("Se ha producido error de tipo: " + error.getDefaultMessage());
                return "categoria/formCategoria";
            }
        }
        flashAttributes.addFlashAttribute("msg", "Se ha añadido la categoria nueva");
        System.out.println("Categoria: " + categoria);
        return "redirect:/categoria/listado";
    }
    @RequestMapping(value="/listado", method=RequestMethod.GET)
    public String mostrarIndex(Model model){
        System.out.println(categoriaController.buscarTodas());
        List<Categoria>listaCategoria=categoriaController.buscarTodas();
        model.addAttribute("listaCategoria",listaCategoria);
        return "categoria/listCategorias";
    }
    
}
