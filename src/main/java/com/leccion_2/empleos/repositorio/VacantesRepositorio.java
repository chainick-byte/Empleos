/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.repositorio;

import com.leccion_2.empleos.modelos.Vacante;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author igorr
 */
@Repository
public interface VacantesRepositorio extends JpaRepository<Vacante, Integer> {
    
    //defino el metodo de busqueda mysql a pelo, se define el tipo de dato que se devuelve y metodo clave
    List <Vacante> findByEstatus(String estatus);
    //busqueda por dos parametros
    //traduccion del metodo creado :"buscar por destacado y estatud ordenar por id de forma descendiente
    List<Vacante> findByDestacadoAndEstatusOrderByIdDesc(int destacado,String estatus);
    //buscamos por intervalos numericos
    List<Vacante> findBySalarioBetweenOrderBySalarioDesc(double salario_1,double salario_2);
    List<Vacante> findByEstatusIn(String[]Estatus);
    public List<Vacante> findByDestacado(int i);
    
}
