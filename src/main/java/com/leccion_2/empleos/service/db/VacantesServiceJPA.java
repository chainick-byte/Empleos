/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.service.db;

import com.leccion_2.empleos.modelos.Vacante;
import com.leccion_2.empleos.repositorio.VacantesRepositorio;
import com.leccion_2.empleos.service.IVacantesService;
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
public class VacantesServiceJPA implements IVacantesService {

    @Autowired
    private VacantesRepositorio repositorioVacantes;

    @Override
    public List<Vacante> buscarTodas() {
        return repositorioVacantes.findAll();
    }

    @Override
    public Vacante buscarPorId(int id) {
        Optional<Vacante> optional = repositorioVacantes.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public void guardar(Vacante vacante) {
        repositorioVacantes.save(vacante);
    }

    @Override
    public List<Vacante> buscaraDestacadas() {
        List<Vacante> lista = repositorioVacantes.findByDestacado(1);
        System.out.println("numero de vacantes aprobado y destacado total es: " + lista.size());
        for (Vacante v : lista) {
            System.out.println(v.getId() + "||" + v.getNombre() + "||" + v.getEstatus() + "||" + v.getDestacado());

        }
        return lista;
    }

    @Override
    public void eliminr(Integer idVacante) {
        repositorioVacantes.deleteById(idVacante);
    }

}
