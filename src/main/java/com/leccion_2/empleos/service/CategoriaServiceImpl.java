/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.service;

import com.leccion_2.empleos.modelos.Categoria;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;



/**
 *
 * @author igorr
 */
@Service
public class CategoriaServiceImpl implements ICategoriaService{
    
    private List <Categoria> listaCategoria=null;
    
    //defino constructor de la clase, donde toda la informacion se va a guardarse en la lista
    
    public  CategoriaServiceImpl(){
        listaCategoria=new LinkedList<Categoria>();
        try{
            Categoria categoria=new Categoria();
            categoria.setId(1);
            categoria.setNombre("Maquinista");
            categoria.setDescripcion("Es un hecho establecido hace demasiado tiempo que un lector se distraerá con el contenido del texto de un sitio mientras que mira su diseño. El punto de usar Lorem Ipsum es que tiene una distribución más o menos normal de las letras, al contrario de usar textos como por ejemplo \"Contenido aquí, contenido aquí\". Estos textos hacen parecerlo un español que se puede leer. Muchos paquetes de autoedición y editores de páginas web usan el Lorem Ipsum como su texto por defecto, y al hacer una búsqueda de \"Lorem Ipsum\" va a dar por resultado muchos sitios web que usan este texto si se encuentran en estado de desarrollo. Muchas versiones han evolucionado a través de los años, algunas veces por accidente, otras veces a propósito (por ejemplo insertándole humor y cosas por el estilo).");
            
            Categoria categoria1=new Categoria();
            categoria1.setId(2);
            categoria1.setNombre("Arquitecto");
            categoria1.setDescripcion("Es un hecho establecido hace demasiado tiempo que un lector se distraerá con el contenido del texto de un sitio mientras que mira su diseño. El punto de usar Lorem Ipsum es que tiene una distribución más o menos normal de las letras, al contrario de usar textos como por ejemplo \"Contenido aquí, contenido aquí\". Estos textos hacen parecerlo un español que se puede leer. Muchos paquetes de autoedición y editores de páginas web usan el Lorem Ipsum como su texto por defecto, y al hacer una búsqueda de \"Lorem Ipsum\" va a dar por resultado muchos sitios web que usan este texto si se encuentran en estado de desarrollo. Muchas versiones han evolucionado a través de los años, algunas veces por accidente, otras veces a propósito (por ejemplo insertándole humor y cosas por el estilo).");
            
            Categoria categoria2=new Categoria();
            categoria2.setId(3);
            categoria2.setNombre("Arquitecto");
            categoria2.setDescripcion("Es un hecho establecido hace demasiado tiempo que un lector se distraerá con el contenido del texto de un sitio mientras que mira su diseño. El punto de usar Lorem Ipsum es que tiene una distribución más o menos normal de las letras, al contrario de usar textos como por ejemplo \"Contenido aquí, contenido aquí\". Estos textos hacen parecerlo un español que se puede leer. Muchos paquetes de autoedición y editores de páginas web usan el Lorem Ipsum como su texto por defecto, y al hacer una búsqueda de \"Lorem Ipsum\" va a dar por resultado muchos sitios web que usan este texto si se encuentran en estado de desarrollo. Muchas versiones han evolucionado a través de los años, algunas veces por accidente, otras veces a propósito (por ejemplo insertándole humor y cosas por el estilo).");
            
            
            listaCategoria.add(categoria);
            listaCategoria.add(categoria1);
            listaCategoria.add(categoria2);
            
        }catch(Exception e){
            System.out.println("El error es " + e.getMessage());
        }
       
    }

    @Override
    public void guardar(Categoria categoria) {
        listaCategoria.add(categoria);
    }

    @Override
    public List<Categoria> buscarTodas() {
        return listaCategoria;
    }

    @Override
    public Categoria buscarPorId(int idCategoria) {
        for(Categoria c: listaCategoria){
            if(c.getId()==idCategoria){
                return c;
            }
        }
        return null;
    }
    
}
