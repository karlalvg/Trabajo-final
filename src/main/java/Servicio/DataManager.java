/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.io.File;

/**
 *
 * @author karlylvg
 */
public class DataManager {
    /*
     Esta Clase se usara para obtener la ruta absoluta del proyecto
     Esta ruta se usa para guardar los archivos que contendran los objetos
     de Empresa Deptartamento y Empleado en el Paquete .Files
    */
    
    private static String absolutePath;
    private static File file;
    private static String dataPath;
    
    public static String getProjectPath(){
        file = new File("");
        absolutePath = file.getAbsolutePath();
        return absolutePath;
    }
    
    public static String getDataPath(){
        dataPath = getProjectPath() + "/src/main/java/Files/";
        

        return  dataPath;
    }
    
    
}
