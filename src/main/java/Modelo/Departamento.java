/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author karlylvg
 */
public class Departamento implements Serializable{
    private int codigo;
    private String Nombre;
    private Empresa empresa;
    private String jefeDepartamental;

    public Departamento(int codigo, String Nombre, Empresa empresa, 
            String jefeDepartamental) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.empresa = empresa;
        this.jefeDepartamental = jefeDepartamental;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

       

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getjefeDepartamental() {
        return jefeDepartamental;
    }

    public void setjefeDepartamental(String jefeDepartamental) {
        this.jefeDepartamental = jefeDepartamental;
    }

   
    
       
    public String mostrarInformacion(){
        return "Departamento{" + "codigo = " + codigo + ", Nombre = " + Nombre 
                + ", gerente = " + ", empresa = " + empresa.getNombre() 
                + ", ubicacion = " + jefeDepartamental + '}';
    }
    
}
