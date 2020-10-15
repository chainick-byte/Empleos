/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.service.db;

import com.leccion_2.empleos.modelos.Categoria;
import com.leccion_2.empleos.repositorio.CategoriasRepositorio;
import com.leccion_2.empleos.service.ICategoriaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 * @author igorr
 */
@Service
@Primary
public class CategoriasSeviceJPA implements ICategoriaService{
    
    @Autowired
    private CategoriasRepositorio repositorioCategoria;
    
    @Override
    public void guardar(Categoria categoria) {
        repositorioCategoria.save(categoria);
    }

    @Override
    public List<Categoria> buscarTodas() {
        return repositorioCategoria.findAll();
    }

    @Override
    public Categoria buscarPorId(int idCategoria) {
        Optional<Categoria>optional=repositorioCategoria.findById(idCategoria);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }
    
}
