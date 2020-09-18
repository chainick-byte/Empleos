/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.modelos;

import java.util.Date;

/**
 *
 * @author igorr
 */
public class Vacante {
    
    private int id;
    private String nombre;
    private String descripcion;
    private Date fecha;
    private Double salario;

    
    // al tener todos los metodos de getter y setter de todas las variables , la clase Vacante
    //se convierte en una clase de tipo BEAN 
    //se autogenerea con BD "insert code"
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Vacante{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha + ", salario=" + salario + '}';
    }
    
    
    
}
