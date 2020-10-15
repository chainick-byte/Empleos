/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.service;

import com.leccion_2.empleos.modelos.Categoria;
import java.util.List;

/**
 *
 * @author igorr
 */
public interface ICategoriaService  {
    
    void guardar(Categoria categoria);
    List<Categoria> buscarTodas();
    Categoria buscarPorId(int idCategoria);
    
}
 