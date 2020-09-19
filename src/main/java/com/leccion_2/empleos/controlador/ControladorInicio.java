/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.controlador;

import com.leccion_2.empleos.modelos.Vacante;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    @GetMapping("/tabla")
    public String mostrarTabla(Model model) throws ParseException{
        List<Vacante> lista=getVacantes();
        model.addAttribute("vacantes", lista);
        
        return "tabla";
    }
    
    @GetMapping("/detalle")
    public String mostrarDetalle(Model model){
        Vacante vacante =new Vacante();
        vacante.setNombre("Ingeniero de comunicaciones");
        vacante.setDescripcion("Se necesita un ingeniero para dar soporte a intranet");
        vacante.setFecha(new Date());
        vacante.setSalario(9700.0);  
        model.addAttribute("vacante", vacante);
        return "detalle";
    }
    private List<Vacante> getVacantes() throws ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        List<Vacante> listaVacantes= new LinkedList<Vacante>();
       try{ 
        //primera oferta de trabajo 
        Vacante vacante1 =new Vacante();
        vacante1.setId(1);
        vacante1.setNombre("Arquitecto");
        vacante1.setDescripcion("Se necesita un arquitecto de software");
        vacante1.setFecha(sdf.parse("08-02-2020"));
        vacante1.setSalario(15000.0);
        vacante1.setDestacado(1);
        //creo segunda oferta de trabajo 
        Vacante vacante2 =new Vacante();
        vacante2.setId(2);
        vacante2.setNombre("Desarralador web");
        vacante2.setDescripcion("Se busca diseñador web / maquetador con 4 años de experiencia");
        vacante2.setFecha(sdf.parse("04-10-2019"));
        vacante2.setSalario(12700.0);
        vacante2.setDestacado(0);
        //tercera oferta detrabajo 
        Vacante vacante3 =new Vacante();
        vacante3.setId(3);
        vacante3.setNombre("becario");
        vacante3.setDescripcion("buscamos un esclavo particular para bdsm party");
        vacante3.setFecha(sdf.parse("01-11-1847"));
        vacante3.setSalario(1000.0);
        vacante3.setDestacado(0);
        
        listaVacantes.add(vacante1);
        listaVacantes.add(vacante2);
        listaVacantes.add(vacante3);
        
       }catch(ParseException e){
           System.out.println("Error: " +e.getMessage());
       }
       return listaVacantes;
    }
    
    @GetMapping("/listado")
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
 




