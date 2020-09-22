/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.service;

import com.leccion_2.empleos.modelos.Vacante;
import java.util.List;

/**
 *
 * @author igorr
 */
public interface IVacantesService {
    List<Vacante>buscarTodas();
    
    Vacante buscarPorId(int id);
    
}
