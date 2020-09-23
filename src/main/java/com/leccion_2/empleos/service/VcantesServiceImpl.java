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
import org.springframework.stereotype.Service;

/**
 *
 * @author igorr
 */
//anoto la anotacion service con lo que indico al spring que es una clase de servicio 
//al tener esta anotacion lo que suceddera que al llamar en mi metodos de mi clase controller 
//se inyectara este cacho de codigo
@Service
public class VcantesServiceImpl implements IVacantesService {

    private List<Vacante> listaVacantes = null;
    //defino constructor de la clase

    public VcantesServiceImpl() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        listaVacantes = new LinkedList<Vacante>();
        try {
            //primera oferta de trabajo 
            Vacante vacante1 = new Vacante();
            vacante1.setId(1);
            vacante1.setNombre("Arquitecto");
            vacante1.setDescripcion("Se necesita un arquitecto de software");
            vacante1.setFecha(sdf.parse("08-02-2020"));
            vacante1.setSalario(15000.0);
            vacante1.setDestacado(1);
            vacante1.setImagen("wrench.png");
            //creo segunda oferta de trabajo 
            Vacante vacante2 = new Vacante();
            vacante2.setId(2);
            vacante2.setNombre("Desarralador web");
            vacante2.setDescripcion("Se busca diseñador web / maquetador con 4 años de experiencia");
            vacante2.setFecha(sdf.parse("04-10-2019"));
            vacante2.setSalario(12700.0);
            vacante2.setDestacado(0);
            vacante2.setImagen("wrench1.png");
            //tercera oferta detrabajo 
            Vacante vacante3 = new Vacante();
            vacante3.setId(3);
            vacante3.setNombre("becario");
            vacante3.setDescripcion("buscamos un esclavo particular para bdsm party");
            vacante3.setFecha(sdf.parse("01-11-1847"));
            vacante3.setSalario(1000.0);
            vacante3.setDestacado(0);

            Vacante vacante4 = new Vacante();
            vacante4.setId(4);
            vacante4.setNombre("Diosito");
            vacante4.setDescripcion("Cras quis nulla efficitur, porttitor sapien ac, mollis odio. Morbi varius porttitor felis, non convallis sapien ultricies ut. Curabitur sagittis laoreet arcu, nec placerat mauris commodo ac. Aenean sit amet mi venenatis, sollicitudin tortor quis, dignissim tellus. Integer sagittis arcu sed lacus feugiat, eget sodales lorem aliquam. Mauris aliquam sollicitudin nisl quis commodo. Praesent convallis justo non accumsan tincidunt. Nullam eleifend tristique dictum. Suspendisse fermentum elit sed velit ornare faucibus. Nunc a ex justo. Suspendisse vestibulum nisl eu risus ullamcorper ornare. In blandit tempus vestibulum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, "
                    + "per inceptos himenaeos. Nulla lobortis ultricies dictum.");
            vacante4.setFecha(sdf.parse("00-00-0000"));
            vacante4.setSalario(1.00);
            vacante4.setDestacado(0);

            listaVacantes.add(vacante1);
            listaVacantes.add(vacante2);
            listaVacantes.add(vacante3);
            listaVacantes.add(vacante4);

        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //VacantesServiceImpl es una implementacion de VacantesService por lo tanto dara error 
    //hasta no se implementan todos los methodos
    @Override
    public List<Vacante> buscarTodas() {

        return listaVacantes;
    }

    @Override
    public Vacante buscarPorId(int id) {
        for (Vacante v : listaVacantes) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    @Override
    public void guardar(Vacante vacante) {
        listaVacantes.add(vacante);
    }
    

}
