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
        String nombreFinal=randomAlphaNumeric(28)+nombreOriginal;
        try {
            //Aqui se forma el nombre de archivo que queremos guardar
            File imagenFile = new File(ruta + nombreFinal);
            System.out.println("Archivo====================>" + imagenFile.getAbsolutePath());
            //guardar fiscamente el archivo
            multiPart.transferTo(imagenFile);
            return nombreFinal;
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
            return null;
        }

    }
    /**
     * metodo para generar una cadena aleatoria de longitud N
     * @param count
     * @return
     */
    public static String randomAlphaNumeric(int count){
        String CARACTERES="zaqwsxcderfvbgtyhnmjuikñpç1234567890";
        StringBuilder sBuilder=new StringBuilder();
        while(count--!=0){
            int caracter=(int)(Math.random()*CARACTERES.length());
            sBuilder.append(CARACTERES.charAt(caracter));
        }
        return sBuilder.toString();
    }

}
