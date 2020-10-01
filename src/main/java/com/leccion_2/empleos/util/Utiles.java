/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion_2.empleos.util;

import java.io.File;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;

public class Utiles {

    public static String guardarArchivo(MultipartFile multiPart, String ruta) {
        //obtenemos el nombre original de archivo
        String nombreOriginal = multiPart.getOriginalFilename();
        nombreOriginal=nombreOriginal.replace(" ", "_");
        try {
            //Aqui se forma el nombre de archivo que queremos guardar
            File imagenFile = new File(ruta + nombreOriginal);
            System.out.println("Archivo" + imagenFile.getAbsolutePath());
            //guardar fiscamente el archivo
            multiPart.transferTo(imagenFile);
            return nombreOriginal;
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
            return null;
        }

    }

}
