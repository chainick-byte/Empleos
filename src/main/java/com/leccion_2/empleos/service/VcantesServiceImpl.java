/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.service;

import com.leccion_2.empleos.modelos.Vacante;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author igorr
 */
public class VcantesServiceImpl implements IVacantesService{
    private List<Vacante> listaVacantes=null;
   //defino contructor de la clase
    public VcantesServiceImpl(){
         SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        listaVacantes= new LinkedList<Vacante>();
       try{ 
        //primera oferta de trabajo 
        Vacante vacante1 =new Vacante();
        vacante1.setId(1);
        vacante1.setNombre("Arquitecto");
        vacante1.setDescripcion("Se necesita un arquitecto de software");
        vacante1.setFecha(sdf.parse("08-02-2020"));
        vacante1.setSalario(15000.0);
        vacante1.setDestacado(1);
        vacante1.setImagen("wrench.png");
        //creo segunda oferta de trabajo 
        Vacante vacante2 =new Vacante();
        vacante2.setId(2);
        vacante2.setNombre("Desarralador web");
        vacante2.setDescripcion("Se busca diseñador web / maquetador con 4 años de experiencia");
        vacante2.setFecha(sdf.parse("04-10-2019"));
        vacante2.setSalario(12700.0);
        vacante2.setDestacado(0);
        vacante2.setImagen("wrench1.png");
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
    }
    
    
   
    //VacantesServiceImpl es una implementacion de VacantesService por lo tanto dara error 
    //hasta no se implementan todos los methodos
    public List<Vacante> buscarTodas(){
      
       
       return listaVacantes;
   }
   
    
}
